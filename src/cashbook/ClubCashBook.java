package cashbook;

import java.util.Scanner;

public class ClubCashBook extends GroupCashBook {
	
	public ClubCashBook(CashBookKind kind) {
		super(kind);
	}
	
	public void setUserInput(Scanner input) {

		System.out.println("���Ƹ� ������Դϴ�.");
		setCashBookDate(input);
		setCashBookInwithYN(input);
		setCashBookOut(input);
		setCashBookSum(input);
	}
}
