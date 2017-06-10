package contenedores;

import javax.swing.JFrame;

public class JFrameTest {

	public static void main(String[] args)
	{
		JFrame f = new JFrame();
		f.setTitle("JFrameTest");
		f.setSize(600, 600);
		f.setLocationRelativeTo(null);
		f.setResizable(true);
		
		f.setVisible(true);
	}

}
