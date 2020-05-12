package cashbook;

import java.util.Scanner;

public class FamilyCashBook extends GroupCashBook {
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
		
		setCashBookDate(input);
		
		setCashBookInwithYN(input);
		setParentInwithYN(input);
		setCashBookOut(input);
		int suminout = sumin + in - out;		
		this.setSuminout(suminout);
	}
	public void setParentInwithYN(Scanner input) {
		char answer = 'x';
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
	}
	
	public void printInfo() {
		String skind = getKindString();
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
