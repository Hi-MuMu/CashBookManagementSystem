package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class CashBookAdderListener implements ActionListener {
	JTextField fieldDate;
	JTextField fieldIn;
	JTextField fieldOut;

	
	public CashBookAdderListener(JTextField fieldDate, JTextField fieldIn, JTextField fieldOut) {

		this.fieldDate = fieldDate;
		this.fieldIn = fieldIn;
		this.fieldOut = fieldOut;
	}

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(fieldDate.getText());
		System.out.println(fieldIn.getText());
		System.out.println(fieldOut.getText());
		
		
	}

}
