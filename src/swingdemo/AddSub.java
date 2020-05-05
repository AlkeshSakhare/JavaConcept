package swingdemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calc();
	}
}

class Calc extends JFrame implements ActionListener {

	JLabel result;
	JButton add, sub, mul, div, clear;
	JTextField t1, t2;

	Calc() {
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(250, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		t1 = new JTextField(20);
		add(t1);
		t2 = new JTextField(20);
		add(t2);
		add = new JButton("+");
		add(add);
		sub = new JButton("-");
		add(sub);
		mul = new JButton("X");
		add(mul);
		div = new JButton("/");
		add(div);
		clear = new JButton("C");
		add(clear);
		result = new JLabel("Result");
		add(result);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		clear.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		try {
			if (e.getSource() == clear) {
				t1.setText("");
				t2.setText("");
			}
			if (!t1.getText().trim().isEmpty() && !t2.getText().trim().isEmpty()) {
				double d1 = Double.parseDouble(t1.getText());
				double d2 = Double.parseDouble(t2.getText());
				if (e.getSource() == add) {
					result.setText((d1 + d2) + "");
				} else if (e.getSource() == sub) {
					result.setText((d1 - d2) + "");
				} else if (e.getSource() == mul) {
					result.setText((d1 * d2) + "");
				} else if (e.getSource() == div) {
					result.setText((d1 / d2) + "");
				}
			}

		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			result.setText(e1 + "");
		} catch (Exception ex) {
			result.setText("Error :" + ex);
		}
	}

}
