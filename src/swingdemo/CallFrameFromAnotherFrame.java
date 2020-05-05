package swingdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class CallFrameFromAnotherFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Callcalc();
	}

}

class Callcalc extends JFrame {

	public Callcalc() {
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(250, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button = new JButton("Open Calc");
		add(button);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Calc();
				dispose();
			}
		});

	}
}
