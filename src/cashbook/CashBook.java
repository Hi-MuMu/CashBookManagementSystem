package cashbook;

import java.io.Serializable;
import java.util.Scanner;

import exception.DateFormatException;

public abstract class CashBook implements CashBookInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4805264194804674734L;
	
	protected CashBookKind kind = CashBookKind.Museong;
	protected String date;
	protected int in;
	protected int out;
	protected int suminout;
	static int total = 0;

	public CashBookKind getKind() {
		return kind;
	}

	public void setKind(CashBookKind kind) {
		this.kind = kind;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) throws DateFormatException {
		if (!date.contains("/")) {
			throw new DateFormatException();
		}

		this.date = date;
	}

	public int getIn() {
		return in;
	}

	public void setIn(int in) {
		this.in = in;
	}

	public int getOut() {
		return out;
	}

	public void setOut(int out) {
		this.out = out;
	}

	public int getSuminout() {
		return suminout;
	}

	public void setSuminout(int suminout) {
		this.suminout = suminout;
	}

	public int getTotal() {
		return total;
	}

	public CashBook() {
	}

	public CashBook(String date) {
		this.date = date;
	}

	public CashBook(CashBookKind kind) {
		this.kind = kind;
	}

	public CashBook(String date, int in, int out, int suminout) {
		this.date = date;
		this.in = in;
		this.out = out;
		this.suminout = suminout;
	}

	public abstract void printInfo(); 

	public void setCashBookDate(Scanner input) {
		String date = "";
		while (!date.contains("/")) {
			System.out.println("날짜를 입력하세요 :");
			date = input.next();
			try {
				this.setDate(date);
			} 
			catch (DateFormatException e) {
				System.out.println("Incorrect Date Fortmat. put the data that contains / ");
			}
		}
	}

	public void setCashBookIn(Scanner input) {
		int in = this.getIn();
		int Suminout = this.getSuminout();
		Suminout = Suminout - in;
		System.out.println("수입을 입력하세요 :");
		in = input.nextInt();
		this.setIn(in);
		Suminout = Suminout + in;
		this.setSuminout(Suminout);
	}

	public void setCashBookOut(Scanner input) {
		int out = this.getOut();
		int suminout = this.getSuminout();
		suminout = suminout + out;
		System.out.println("지출을 입력하세요 :");
		out = input.nextInt();
		this.setOut(out);
		suminout = suminout - out;
		this.setSuminout(suminout);
	}

	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case Museong:
			skind = "MS";
			break;
		case Club:
			skind = "Club";
			break;
		case Family:
			skind = "Family";
			break;
		case Friends:
			skind = "Friends";
			break;
		default:
		}
		return skind;
	}

	public void setCashBookSum(Scanner input) {
		int suminout = in - out;
		System.out.println("수입 - 지출은 : " + suminout);
		this.setSuminout(suminout);
	}

}