package cashbook;

import java.util.Scanner;

public class ClubCashBook extends CashBook {
	
	public ClubCashBook(CashBookKind kind) {
		super(kind);
	}

	public void setUserInput(Scanner input) {

		System.out.println("동아리 가계부입니다.");

		System.out.println("날짜를 입력하세요 :");
		String date = input.next();
		this.setDate(date);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("수입이 있나요 ? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' && answer == 'Y'){
				System.out.print("수입을 입력하세요 : ");
				int in = input.nextInt();
				this.setIn(in);
				break;
			}
			else if (answer == 'n' && answer == 'N') {
				System.out.println("코로나로 인해 동아리활동을 못하여 수입이 없습니다.");
				this.setIn(0);
				break;
			}
			else {
			}
		}

		System.out.println("지출을 입력하세요 :");
		int out = input.nextInt();
		this.setOut(out);

		int suminout = in - out;		
		this.setSuminout(suminout);

	}
}
//	if (suminout > 0) {
//	System.out.println("오늘은  " + suminout + " 만큼 흑자입니다.");
//}
//else if (suminout == 0) {
//	System.out.println("오늘은 수입과 지출이 같습니다.");			
//}
//else {
//	System.out.println("오늘은 " + suminout + " 만큼 적자입니다.");
//}