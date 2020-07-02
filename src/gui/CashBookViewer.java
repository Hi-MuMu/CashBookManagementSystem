package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import cashbook.CashBook;
import cashbook.CashBookInput;
import manager.CashBookManager;

public class CashBookViewer extends JPanel {
	
	WindowFrame frame;
	
	CashBookManager cashBookManager;
	
	

	public CashBookViewer(WindowFrame frame, CashBookManager cashBookManager) {
		this.frame = frame;
		this.cashBookManager = cashBookManager;
		
		System.out.println("***"+cashBookManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Date");
		model.addColumn("In");
		model.addColumn("Out");
		model.addColumn("Total");
		
		int total = 0;
		for (int i=0; i < cashBookManager.size(); i++) {
			Vector row = new Vector();
			CashBookInput ci = cashBookManager.get(i);
			row.add(ci.getDate());
			row.add(ci.getIn());
			row.add(ci.getOut());
			total = total + ci.getIn() - ci.getOut();
			row.add(total);
			model.addRow(row);
		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}
}
