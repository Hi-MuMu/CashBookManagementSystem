package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {
	
	MenuSelection menuslection;

	CashBookAdder cashbookadder;
	CashBookViewer cashbookviewer;
	

	public WindowFrame() {
		
		this.menuslection = new MenuSelection(this);
		this.cashbookadder = new CashBookAdder(this);
		this.cashbookviewer = new CashBookViewer(this);
		
		
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setupPanel(menuslection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuslection() {
		return menuslection;
	}

	public void setMenuslection(MenuSelection menuslection) {
		this.menuslection = menuslection;
	}

	public CashBookAdder getCashbookadder() {
		return cashbookadder;
	}

	public void setCashbookadder(CashBookAdder cashbookadder) {
		this.cashbookadder = cashbookadder;
	}

	public CashBookViewer getCashbookviewer() {
		return cashbookviewer;
	}

	public void setCashbookviewer(CashBookViewer cashbookviewer) {
		this.cashbookviewer = cashbookviewer;
	}


}
