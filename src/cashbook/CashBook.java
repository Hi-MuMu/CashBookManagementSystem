package cashbook;

import java.util.Scanner;

public class CashBook {
	protected CashBookKind kind = CashBookKind.January;
	protected String date;
	protected int in;
	protected int out;
	protected int total;
	
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

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public CashBook() {
	}
	
	public CashBook(String date) {
		this.date = date;
	}
	
	public CashBook(String date, int in, int out, int total) {
		this.date = date;
		this.in = in;
		this.out = out;
		this.total = total;
	}
	
	public void printInfo() {
		System.out.println("��¥�� :" + date);
		System.out.println("������ :" + in);
		System.out.println("������ :" + out);
		System.out.println("������ :" + total);
	}
	
	public void getUserInput(Scanner input) {
		System.out.println("�̹����� 31�� ���� �ֽ��ϴ�.");
		
		System.out.println("��¥�� �Է��ϼ��� :");
		String date = input.next();
		this.setDate(date);
		
		System.out.println("������ �Է��ϼ��� :");
		int in = input.nextInt();
		this.setIn(in);
		
		System.out.println("������ �Է��ϼ��� :");
		int out = input.nextInt();
		this.setOut(out);
		
		int total = in - out;
		System.out.println("������ : " + total);
		this.setTotal(total);
	}
}
	