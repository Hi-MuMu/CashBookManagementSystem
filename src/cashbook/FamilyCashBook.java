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

		
		
		System.out.println("가족 가계부입니다.");

		System.out.println("날짜를 입력하세요 :");
		String date = input.next();
		this.setDate(date);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("당신의 수입이 있나요 ? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y'){
				System.out.println("당신의 수입을 입력하세요 : ");
				int in = input.nextInt();
				this.setIn(in);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				System.out.println("수입이 없습니다.");
				this.setIn(0);
				break;
			}
			else {
			}
		}
		
		answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("부모님의 수입이 있나요 ? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y'){
				System.out.println("부모님의 수입을 입력하세요 : ");
				int in = input.nextInt();
				this.setParentin(in);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				System.out.println("수입이 없습니다.");
				this.setParentin(0);
				break;
			}
			else {
			}
		}
		int sumin = in + parentin;
		this.setSumin(sumin);
		
		System.out.println("지출을 입력하세요 :");
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
		System.out.println("날짜는 :" + date);
		System.out.println("부모님의 수입은 :" + parentin);
		System.out.println("나의 수입은 :" + in);
		System.out.println("총 수입은 :" + sumin);
		System.out.println("지출은 :" + out);
		System.out.println("수입 - 지출은 :" + suminout);
		System.out.println();
	}
}
