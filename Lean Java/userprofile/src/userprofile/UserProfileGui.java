package userprofile;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import java.awt.List;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserProfileGui {

	private JFrame frame;
	private JTextField NameTextField;
	private JTextField LastnameTextField;
	private JTextField EmailTextField;
	private JButton SendButton;
	private JLabel AddressLabel;
	private JTextField AddressTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserProfileGui window = new UserProfileGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserProfileGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 477, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel NameLabel = new JLabel("Name");
		NameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel EmailLabel = new JLabel("Email");
		EmailLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel LastNameLabel = new JLabel("LastName");
		LastNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		NameTextField = new JTextField();
		NameTextField.setColumns(10);
		
		LastnameTextField = new JTextField();
		LastnameTextField.setColumns(10);
		
		EmailTextField = new JTextField();
		EmailTextField.setColumns(10);
		
		SendButton = new JButton("Send");
		SendButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name = NameTextField.getText();
				NameTextField.setText("cc");
				System.out.println("");
			}
		});
		SendButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		AddressLabel = new JLabel("Adress");
		AddressLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		AddressTextField = new JTextField();
		AddressTextField.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(162)
					.addComponent(SendButton, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(221, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(137)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(LastNameLabel, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
								.addComponent(AddressLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(EmailLabel)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(NameLabel, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(LastnameTextField, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
							.addComponent(NameTextField, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
							.addComponent(EmailTextField, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
						.addComponent(AddressTextField, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
					.addGap(150))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(103)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(NameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(NameLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(LastnameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(LastNameLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(EmailTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(EmailLabel))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(AddressLabel)
						.addComponent(AddressTextField, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(SendButton)
					.addContainerGap(144, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		 		}
}
