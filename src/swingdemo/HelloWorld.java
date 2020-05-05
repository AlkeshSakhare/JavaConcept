package swingdemo;


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld {

	public static void main(String[] args) {
		new Abc();
	}
}

class Abc extends JFrame {

	Abc() {
		setVisible(true);// by default its invisible
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLayout(new FlowLayout()); // By default its card layout 000=-- GridLayout/FlowLayout
		add(new JLabel("Hello World"));
		add(new JLabel("Hello Alkesh"));

	}
}
