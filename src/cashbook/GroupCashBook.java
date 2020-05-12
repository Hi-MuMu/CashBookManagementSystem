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
		System.out.println("��¥�� :" + date);
		System.out.println("������ :" + in);
		System.out.println("������ :" + out);
		System.out.println("���� - ������ :" + suminout);
		System.out.println();
	}
	
	public void setCashBookInwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("������ �ֳ��� ? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y'){
				setCashBookIn(input);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				System.out.println("�ڷγ��� ���� ���Ƹ�Ȱ���� ���Ͽ� ������ �����ϴ�.");
				this.setIn(0);
				break;
			}
			else {
			}
		}
	}	

}
