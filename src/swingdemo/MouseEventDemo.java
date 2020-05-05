package swingdemo;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;

public class MouseEventDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEvent();
	}

}

class MouseEvent extends JFrame {

	public MouseEvent() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(250, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				int x = e.getX();
				int y = e.getY();
				System.out.println("(" + x + "," + y + ")");
			}
		});

	}
}