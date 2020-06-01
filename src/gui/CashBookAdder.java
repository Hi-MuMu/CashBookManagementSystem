package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CashBookAdder extends JFrame {
	public CashBookAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		JLabel lableDate = new JLabel("날짜: ", JLabel.TRAILING);
		JTextField fieldDate = new JTextField(10);
		lableDate.setLabelFor(fieldDate);
		panel.add(lableDate);
		panel.add(fieldDate);

		JLabel lableIn = new JLabel("수입: ", JLabel.TRAILING);
		JTextField fieldIn = new JTextField(10);
		lableDate.setLabelFor(fieldIn);
		panel.add(lableIn);
		panel.add(fieldIn);

		JLabel lableOut = new JLabel("지출: ", JLabel.TRAILING);
		JTextField fieldOut = new JTextField(10);
		lableDate.setLabelFor(fieldOut);
		panel.add(lableOut);
		panel.add(fieldOut);

		panel.add(new JButton("Save"));
		panel.add(new JButton("Cancel"));

		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);

		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);

	}

}
//JLabel lableDate = new JLabel("Date: ", JLabel.TRAILING);
//JTextField fieldDate = new JTextField(10);
//lableDate.setLabelFor(fieldDate);
//panel.add(lableDate);
//panel.add(fieldDate);