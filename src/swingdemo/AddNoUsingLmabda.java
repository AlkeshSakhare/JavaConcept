package swingdemo;

import java.awt.FlowLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddNoUsingLmabda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Add1();
	}
}

@SuppressWarnings("serial")
class Add1 extends JFrame {

	JTextField no1, no2;
	JButton addButton;
	JLabel result;

	Add1() {
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(250, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		no1 = new JTextField(20);
		add(no1);
		no2 = new JTextField(20);
		add(no2);
		addButton = new JButton("+");
		add(addButton);
		result = new JLabel("Addition: ");
		add(result);
		addButton.addActionListener(e -> {
			try {
				int n1 = Integer.parseInt(no1.getText());
				int n2 = Integer.parseInt(no2.getText());
				int ans = n1 + n2;
				result.setText(ans + "");
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				result.setText(e1 + "");
			}
		});
	}
}