package MySever;

import javax.swing.JFrame;

public class ServerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server s = new Server();
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.startRunning();
	}

}
