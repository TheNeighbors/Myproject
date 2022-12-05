package ClientPackage;

import javax.swing.JFrame;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client clie = new Client("localhost");
		clie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		clie.startRunning();
	}

}
