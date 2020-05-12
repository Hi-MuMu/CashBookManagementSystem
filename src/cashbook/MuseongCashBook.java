package cashbook;

import java.util.Scanner;

public class MuseongCashBook extends CashBook {
	
	public MuseongCashBook(CashBookKind kind) {
		super(kind);
	}

	
	public void setUserInput(Scanner input) {
		setCashBookDate(input);
		
		setCashBookIn(input);
		
		setCashBookOut(input);
		
		setCashBookSum(input);
		
		total = total + suminout;
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind :" + skind);
		System.out.println("날짜는 :" + date);
		System.out.println("수입은 :" + in);
		System.out.println("지출은 :" + out);
		System.out.println("수입 - 지출은 :" + suminout);
		System.out.println();
	}
	
}
