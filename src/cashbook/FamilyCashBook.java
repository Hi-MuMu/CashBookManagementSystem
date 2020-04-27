package cashbook;

import java.util.Scanner;

public class FamilyCashBook extends CashBook {
	protected int parentin;
	protected int sumin;
	
	public void setParentin(int parentin) {
		this.parentin = parentin;
	}
	
	public void setSumin(int sumin) {
		this.sumin = sumin;
	}
	
	public int getParentin() {
		return parentin;
	}
	
	public int getSumin() {
		return sumin;
	}
	
	public FamilyCashBook(CashBookKind kind) {
		super(kind);
	}
	
	public void setUserInput(Scanner input) {

		
		
		System.out.println("���� ������Դϴ�.");

		System.out.println("��¥�� �Է��ϼ��� :");
		String date = input.next();
		this.setDate(date);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("����� ������ �ֳ��� ? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y'){
				System.out.println("����� ������ �Է��ϼ��� : ");
				int in = input.nextInt();
				this.setIn(in);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				System.out.println("������ �����ϴ�.");
				this.setIn(0);
				break;
			}
			else {
			}
		}
		
		answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("�θ���� ������ �ֳ��� ? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y'){
				System.out.println("�θ���� ������ �Է��ϼ��� : ");
				int in = input.nextInt();
				this.setParentin(in);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				System.out.println("������ �����ϴ�.");
				this.setParentin(0);
				break;
			}
			else {
			}
		}
		int sumin = in + parentin;
		this.setSumin(sumin);
		
		System.out.println("������ �Է��ϼ��� :");
		int out = input.nextInt();
		this.setOut(out);

		int suminout = sumin - out;		
		this.setSuminout(suminout);

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
		System.out.println("�θ���� ������ :" + parentin);
		System.out.println("���� ������ :" + in);
		System.out.println("�� ������ :" + sumin);
		System.out.println("������ :" + out);
		System.out.println("���� - ������ :" + suminout);
		System.out.println();
	}
}
