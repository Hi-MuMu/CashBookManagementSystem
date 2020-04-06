import java.util.Scanner;

public class CashBookManager {
	CashBook cashbook = new CashBook();
	Scanner input;
	CashBookManager(Scanner input) {
		this.input = input;
	}
	
	public void addcashbook() {
		cashbook.define();
		for (int i = 0; i<7;i++) {
			System.out.println("날짜를 입력하세요 :");
			cashbook.date[i] = input.next();
			if ("0".equals(cashbook.date[i])) {
				break;
			}
			System.out.println("수입을 입력하세요 :");
			cashbook.incomings[i] = input.nextInt();
			cashbook.sum = cashbook.sum + cashbook.incomings[i];
			cashbook.total = cashbook.total + cashbook.incomings[i]; 
			System.out.println("지출을 입력하세요 :");
			cashbook.outgoings[i] = input.nextInt();
			cashbook.Minus = cashbook.Minus + cashbook.outgoings[i];
			cashbook.total = cashbook.total - cashbook.outgoings[i];
		}
	}
	public void deletecashbook() {
		System.out.println("수입과 지출을 삭제할 날짜를 입력하세요 : ");
		String date1 = input.next();
		for (int i = 0; i< 7;i++) {
			if(date1.equals(cashbook.date[i])) {
				cashbook.total = cashbook.total - cashbook.incomings[i] + cashbook.outgoings[i];
				cashbook.sum = cashbook.sum - cashbook.incomings[i];
				cashbook.Minus = cashbook.Minus - cashbook.outgoings[i];
				System.out.println("수입과 지출을 삭제후 남은 합계는 : " + cashbook.total);
				cashbook.incomings[i] = 0;
				cashbook.outgoings[i] = 0;
				System.out.println("수입과 지출이 삭제됐습니다.");
			}
		}
	}
	public void editcashbook() {
		System.out.println("수입과 지출을 수정할 날짜를 입력하세요 : ");
		String date1 = input.next();
		for (int i = 0; i< 7;i++) {
			if(date1.equals(cashbook.date[i])) {
				int num=4;
				while (num != 5) {
					System.out.println("** Cash Book Info Edit Menu **");
					System.out.println(" 1. Edit Date ");
					System.out.println(" 2. Editte Cash Book");
					System.out.println(" 5. Exit");
					System.out.println("Select one number between 1 - 3 :");
					num = input.nextInt();
					if (num==1) {
						System.out.println("날짜를 입력하세요 :");
						cashbook.date[i] = input.next();
					}
					else if (num==2) {
						System.out.println("수정전 수입 :" + cashbook.incomings[i] + "지출 :" + cashbook.outgoings[i] + "합계 :" + cashbook.total);
						cashbook.total = cashbook.total - cashbook.incomings[i] + cashbook.outgoings[i];
						cashbook.sum = cashbook.sum - cashbook.incomings[i];
						cashbook.Minus = cashbook.Minus - cashbook.outgoings[i];
						System.out.println("수정할 수입을 입력하세요 : ");
						cashbook.incomings[i] = input.nextInt();
						System.out.println("수정할 지출을 입력하세요 : ");
						cashbook.outgoings[i] = input.nextInt();
						cashbook.total = cashbook.total + cashbook.incomings[i] - cashbook.outgoings[i];
						cashbook.sum = cashbook.sum + cashbook.incomings[i];
						cashbook.Minus = cashbook.Minus + cashbook.outgoings[i];
						System.out.println("수입과 지출과 합계가 수정됐습니다.");
						System.out.println("수정후 수입 :" + cashbook.incomings[i] + "지출 :" + cashbook.outgoings[i] + "합계 :" + cashbook.total);
					}
					else {
						continue;
					}
				}
			}
		}
	}
	public void viewcashbook() {
		System.out.println("특정 날짜의 수입과 지출을 보려면  1을 입력하세요, 모든 날짜의 수입과 지출과 총합을 보려면 2번을 선택하세요");
		int num = input.nextInt();
		if (num == 1) {
			System.out.println("날짜를 입력하세요 :");
			String date1 = input.next();
			for (int i = 0; i< 7;i++) {
				if(date1.equals(cashbook.date[i])) {
					System.out.println("수입 :" + cashbook.incomings[i] + "지출 :" + cashbook.outgoings[i]);
				}
			}
		}
		if (num == 2) {
			cashbook.printInfo();
		}
	}
}
