package swingdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddNo addno = new AddNo();
	}

}

class AddNo extends JFrame implements ActionListener {

	JTextField no1, no2;
	JButton addButton;
	JLabel result;

	AddNo() {
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
		addButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int n1 = Integer.parseInt(no1.getText());
			int n2 = Integer.parseInt(no2.getText());
			int ans = n1 + n2;

			result.setText(ans + "");
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			result.setText(e1 + "");
		}
	}


}