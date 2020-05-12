package cashbook;

import java.util.Scanner;

public abstract class GroupCashBook extends CashBook {
	
	public GroupCashBook(CashBookKind kind) {
		super(kind);
	}

	@Override
	public abstract void setUserInput(Scanner input);
		
	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind :" + skind);
		System.out.println("날짜는 :" + date);
		System.out.println("수입은 :" + in);
		System.out.println("지출은 :" + out);
		System.out.println("수입 - 지출은 :" + suminout);
		System.out.println();
	}
	
	public void setCashBookInwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("수입이 있나요 ? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y'){
				setCashBookIn(input);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				System.out.println("코로나로 인해 동아리활동을 못하여 수입이 없습니다.");
				this.setIn(0);
				break;
			}
			else {
			}
		}
	}	

}
