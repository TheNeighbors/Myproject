package database;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeFile("Chaiwut");
		writeFile("Chaiwutsdfsfsdfsdfsdffsdfsfsfdsfdsf");
			System.out.print( "Read :" +readFile("text.txt"));
		}
		private static void writeFile(String content) {
			try {
				FileWriter fw = new FileWriter ("text.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(content);
				System.out.println("DONE !");
				bw.close();
				fw.close();
			}catch(IOException e) {
				e.getStackTrace();
			}
			
			
	}
		private static String readFile(String file) {
			String text = "";
			try {
			FileReader fr = new FileReader(file);
			BufferedReader  br =new BufferedReader(fr);
			
			String temp ;
				while((temp = br.readLine())  != null) {
					text = temp ;
				}
			}catch(IOException e) {
				e.getStackTrace();
			}
			return text ;
		}
}
