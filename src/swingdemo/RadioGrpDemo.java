package swingdemo;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

public class RadioGrpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioDemo();
	}

}

class RadioDemo extends JFrame {

	JTextField t1;
	JLabel l1;
	JRadioButton r1, r2;
	JButton b1;
	JCheckBox c1, c2;

	public RadioDemo() {
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(250, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		t1 = new JTextField(20);
		l1 = new JLabel();
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		b1 = new JButton("OK");
		c1 = new JCheckBox("Dancing");
		c2 = new JCheckBox("Singing");
		add(t1);
		add(r1);
		add(r2);
		add(c1);
		add(c2);
		add(b1);
		add(l1);
		ButtonGroup group = new ButtonGroup();
		group.add(r1);
		group.add(r2);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name = t1.getText();

				if (r1.isSelected()) {
					name = "Mr." + name;
				} else if (r2.isSelected()) {
					name = "Miss." + name;
				}
				if (c1.isSelected()) {
					name = name + " is Dancer";
				}
				if (c2.isSelected()) {
					name = name + " is Singer";
				}
				l1.setText(name);
			}
		});
	}
}