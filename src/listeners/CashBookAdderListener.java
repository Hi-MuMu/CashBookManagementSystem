package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import cashbook.CashBookInput;
import cashbook.CashBookKind;
import cashbook.MuseongCashBook;
import exception.DateFormatException;
import manager.CashBookManager;

public class CashBookAdderListener implements ActionListener {
	JTextField fieldDate;
	JTextField fieldIn;
	JTextField fieldOut;
	CashBookManager cashBookManager;

	
	public CashBookAdderListener(JTextField fieldDate, JTextField fieldIn, JTextField fieldOut, CashBookManager cashBookManager) {

		this.fieldDate = fieldDate;
		this.fieldIn = fieldIn;
		this.fieldOut = fieldOut;
		this.cashBookManager = cashBookManager;
	}

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		CashBookInput cashbook = new MuseongCashBook(CashBookKind.Museong);
		try {
			cashbook.setDate(fieldDate.getText());
			cashbook.setIn(Integer.parseInt(fieldIn.getText()));
			cashbook.setOut(Integer.parseInt(fieldOut.getText()));
			cashbook.printInfo();
		} catch (DateFormatException e1) {

			e1.printStackTrace();
		}

		
		
	}
}
