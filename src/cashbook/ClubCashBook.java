package cashbook;

import java.util.Scanner;

public class ClubCashBook extends CashBook {
	
	public ClubCashBook(CashBookKind kind) {
		super(kind);
	}

	public void setUserInput(Scanner input) {

		System.out.println("���Ƹ� ������Դϴ�.");

		System.out.println("��¥�� �Է��ϼ��� :");
		String date = input.next();
		this.setDate(date);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("������ �ֳ��� ? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' && answer == 'Y'){
				System.out.print("������ �Է��ϼ��� : ");
				int in = input.nextInt();
				this.setIn(in);
				break;
			}
			else if (answer == 'n' && answer == 'N') {
				System.out.println("�ڷγ��� ���� ���Ƹ�Ȱ���� ���Ͽ� ������ �����ϴ�.");
				this.setIn(0);
				break;
			}
			else {
			}
		}

		System.out.println("������ �Է��ϼ��� :");
		int out = input.nextInt();
		this.setOut(out);

		int suminout = in - out;		
		this.setSuminout(suminout);

	}
}
//	if (suminout > 0) {
//	System.out.println("������  " + suminout + " ��ŭ �����Դϴ�.");
//}
//else if (suminout == 0) {
//	System.out.println("������ ���԰� ������ �����ϴ�.");			
//}
//else {
//	System.out.println("������ " + suminout + " ��ŭ �����Դϴ�.");
//}