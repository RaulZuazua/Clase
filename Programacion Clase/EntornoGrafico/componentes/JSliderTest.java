package componentes;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JSlider;

public class JSliderTest {

	public static void main(String[] args)

	{

		JFrame f = new JFrame();
		f.setTitle("JSliderTest");
		f.setSize(200, 150);
		f.getContentPane().setLayout(new FlowLayout());
		JSlider s = new JSlider(JSlider.HORIZONTAL, 0, 30, 15);
		s.setMajorTickSpacing(10);
		s.setMinorTickSpacing(1);
		s.setPaintTicks(true);
		s.setPaintLabels(true);
		f.getContentPane().add(s);
		f.setVisible(true);
	}

}
