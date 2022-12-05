package MySever;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.*;

public class Server extends JFrame { // เรียก Jframe
	private JTextField userText; // เอาไว้รับข้อความจากUser
	private JTextArea Chating; // หน้าจอแสดงผล
	private ObjectOutputStream output; // ตัวส่งข้อมูลหาServer
	private ObjectInputStream input;
	private ServerSocket server; //
	private Socket connection; //

	public Server() { // สร้างconstrutor
		super("Sever Computer"); // เซ็ตtaitleให้กับJframe
		userText = new JTextField(); // สร้างObj จากuserTextfield
		Chating = new JTextArea(); // สร้างObj จากuserTextarea
		userText.setEditable(false); // ใส่คุณสมบัติให้ไม่สามารถพิมพ์ข้อความได้
		userText.addActionListener(new ActionListener() { // userTexเพิ่มActionListenerจะทำการ override actionPerformed

			@Override
			public void actionPerformed(ActionEvent e) { // เมื่อเป็นmethodที่ทำให้การพิมพ์ข้อความในช่องuserText
															// และกดEnterจะมีการส่งข้อมูลละหว่างServer
															// กับclientโดยดำเนินการผ่านMethodภายใน
				SendMesage(e.getActionCommand()); // เรียกใช้Methodนี่จะส่งข้อความ(e.getActionCommand())ที่พิมพ์จากserver
													// ไปยังclient
				userText.setText(""); // สั่งให้userText SetText (เคลียTextที่พิมพ์ไป)

			}
		});

		add(userText, BorderLayout.NORTH); // แอด component จะวางlayoutใหม่ให้ไปอยู่ที่BorderLayout.NORTH
		add(new JScrollPane(Chating));// เพิ่มการแสดงผลข้อมูลให้มีแถบสกอบาร์
		setSize(300, 300); // กำหนดขนาดหน้าจอของJFrame
		setVisible(true);

	}
	

	public void startRunning() {
		try {
			server = new ServerSocket(6789, 100); //
			while (true) {
				try {
					waitforConnection(); // รอclientเชื่อมกับserver
					setUpStream();
					whileChatting(); // แสดงค่าของServer และ Client

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					closeObject(); // ปิดObjทั้งหมด
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	

	public void SendMesage(String str) { // Methodสำหรับเขียนข้อมูลลงในObjและส่งจากServerไปยังClient
		try {
			output.writeObject("SERVER : "+str);
			output.flush();
			showMessage("\nSERVER : " + str);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		

		private void waitforConnection() { //  Method รอการเชื่อต่อจากClient
		try {
			showMessage("รอClientเชื่อมต่อ... \n ");
			connection=server.accept();
			showMessage("เชื่อมต่อแล้ว "+ connection.getInetAddress());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void setUpStream() {  //method ไว้รับส่งข้อมูลกับclient
		try {
		output = new ObjectOutputStream(connection.getOutputStream());		//ไว้ส่งข้อมูลกับClientที่เรากำหนดผ่านConnection
		output.flush(); // เป็นคำสังเพื่อให้Outputเขียนข้อมูลและส่ง
		input = new ObjectInputStream(connection.getInputStream());		//ไว้รับข้อมูลกับClientที่เรากำหนดผ่านConnection
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private void whileChatting() {	// methodที่จะทำงานตลอดเวลา
		String message = "Now Connected";
		ableToType(true); // เป็นMedthodที่จะเปลียนสถานะ(เดิมคือuserText.setEditable(false) )เปลี่นเป็นtrueเมอืมีดารเชื่อมต่อกับClientเพื่อให้สามารถพิมพ์ข้อความได้
		do{
			try {
				message = (String)input.readObject(); //เป็นการอ่านค่าจากClientที่ส่งมา
				showMessage("\n "+message );
			}catch(Exception e) {
				e.printStackTrace();
			}
		}while(!message.equals("CLIENT-END"));
			
		
		
	}

	private void ableToType(boolean b) { // เป็นMethodที่กำหนดสถานะของuserTextว่าจะให้ผิมได้หรือไม่
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				userText.setEditable(b);
				
			}
		});
		
	}
	
	private void closeObject() {	//method สำหรับปิดObj
		showMessage("Close Connection\n");
		ableToType(false);
		try {
		output.close();
		input.close();
		connection.close();
		
		} catch (Exception e) {
		e.printStackTrace();
		}
		
	}

	private void showMessage(String txt) {  // Methodไว้แสดงผลที่หน้าจอของเรา
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				Chating.append(txt); // เป็นการนำStringมาต่อกัน
				
			}
		});
			
		
	}
}
