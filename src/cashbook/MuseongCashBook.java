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
		System.out.println("��¥�� :" + date);
		System.out.println("������ :" + in);
		System.out.println("������ :" + out);
		System.out.println("���� - ������ :" + suminout);
		System.out.println();
	}
	
}
