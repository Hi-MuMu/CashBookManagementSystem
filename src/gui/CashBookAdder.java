package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.CashBookAdderListener;
import manager.CashBookManager;

public class CashBookAdder extends JPanel {
	
	WindowFrame frame;
	
	CashBookManager cashBookManager;
	
	public CashBookAdder(WindowFrame frame, CashBookManager cashBookManager) {
		this.frame = frame;
		this.cashBookManager = cashBookManager;
		
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
		
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(new CashBookAdderListener(fieldDate, fieldIn, fieldOut, cashBookManager));
		JButton cancleButton = new JButton("Cancel");
		
		panel.add(lableOut);
		panel.add(fieldOut);
		
		
		panel.add(saveButton);
		panel.add(cancleButton);

		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.add(panel);
		
	}
}
//JLabel lableDate = new JLabel("Date: ", JLabel.TRAILING);
//JTextField fieldDate = new JTextField(10);
//lableDate.setLabelFor(fieldDate);
//panel.add(lableDate);
//panel.add(fieldDate);