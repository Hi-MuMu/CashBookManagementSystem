package cashbook;

import java.util.Scanner;

public class CashBook {
	protected CashBookKind kind = CashBookKind.Museong;
	protected String date;
	protected int in;
	protected int out;
	protected int suminout;
	static int total = 0;
	static int total1 = 0;
	
	public CashBookKind getKind() {
		return kind;
	}

	public void setKind(CashBookKind kind) {
		this.kind = kind;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
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
	

	public void printInfo() {
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
		System.out.println("kind :" + skind);
		System.out.println("��¥�� :" + date);
		System.out.println("������ :" + in);
		System.out.println("������ :" + out);
		System.out.println("���� - ������ :" + suminout);
		System.out.println();
	}
	
	public void setUserInput(Scanner input) {
		
		System.out.println("��¥�� �Է��ϼ��� :");
		String date = input.next();
		this.setDate(date);
		
		System.out.println("������ �Է��ϼ��� :");
		int in = input.nextInt();
		this.setIn(in);
		
		System.out.println("������ �Է��ϼ��� :");
		int out = input.nextInt();
		this.setOut(out);
		
		int suminout = in - out;
		System.out.println("���� - ������ : " + suminout);
		this.setSuminout(suminout);
		
		total = total + suminout;
	}
}