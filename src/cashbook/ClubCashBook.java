package cashbook;

import java.util.Scanner;

public class ClubCashBook extends GroupCashBook {
	
	public ClubCashBook(CashBookKind kind) {
		super(kind);
	}
	
	public void setUserInput(Scanner input) {

		System.out.println("동아리 가계부입니다.");
		setCashBookDate(input);
		setCashBookInwithYN(input);
		setCashBookOut(input);
		setCashBookSum(input);
	}
}
