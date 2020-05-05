package swingdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class ProgressBarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CallFrame();
	}

}

class CallFrame extends JFrame implements ActionListener {
	JProgressBar bar;
	int i = 0;

	public CallFrame() {
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(250, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button = new JButton("Open Calc");
		add(button);
		bar = new JProgressBar(0, 20);
		add(bar);

		Timer timer = new Timer(250, this);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				timer.start();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (i == 20) {
			new Calc();
			dispose();
		}
		i++;
		bar.setValue(i);
	}
}