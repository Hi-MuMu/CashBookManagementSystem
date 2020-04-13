import java.util.Scanner;
import java.util.ArrayList;

public class CashBookManager {
	ArrayList<CashBook> cashbooks = new ArrayList<CashBook>();
	Scanner input;
	CashBookManager(Scanner input) {
		this.input = input;
	}
	
	public void addcashbook() {
		CashBook cashbook = new CashBook();
		System.out.println("날짜를 입력하세요 :");
		cashbook.date = input.next();
		System.out.println("수입을 입력하세요 :");
		cashbook.in = input.nextInt(); 
		System.out.println("지출을 입력하세요 :");
		cashbook.out = input.nextInt();
		cashbook.total = cashbook.in - cashbook.out;
		cashbooks.add(cashbook);
	}
		

	public void deletecashbook() {
		System.out.println("날짜를 입력하세요 : ");
		String date1 = input.next();
		int index = -1 ;
		for (int i= 0; i<cashbooks.size(); i++) {
			if(date1.equals(cashbooks.get(i).date)) {
				index = i; 
				break;
			}	
		}
		if (index >= 0) {
			cashbooks.remove(index);
			CashBook.numCashBookDateRegistered--;
			System.out.println("The cash book " + date1 + "is deleted");
		}
		else {
			System.out.println("The cash book has not been registerd ");
			return;
		}	
	}
	
	public void editcashbook() {
		System.out.println("날짜를 입력하세요 : ");
		String date1 = input.next();
		for (int i= 0; i<cashbooks.size(); i++) {
			CashBook cashbook = cashbooks.get(i);
			if(date1.equals(cashbook.date)) {
				int num = 4;
				while (num != 5) {
					System.out.println("** Cash Book Info Edit Menu **");
					System.out.println(" 1. Edit date");
					System.out.println(" 2. Edit incomings");
					System.out.println(" 3. Edit outgoings");
					System.out.println(" 4. Edit total");
					System.out.println(" 5. Exit");
					System.out.println("Select one number between 1 - 5 :");
					num = input.nextInt();
					if (num==1) {
						System.out.println("날짜를 입력하세요 :");
						cashbook.date = input.next();
					}
					else if (num==2) {
						cashbook.total = cashbook.total - cashbook.in;
						System.out.println("수입을 입력하세요 :");
						cashbook.in = input.nextInt();
						cashbook.total = cashbook.total + cashbook.in;
					}
					else if (num==3) {
						cashbook.total = cashbook.total + cashbook.out;
						System.out.println("지출을 입력하세요 :");
						cashbook.out = input.nextInt();
						cashbook.total = cashbook.total - cashbook.out;
					}
					else {
						continue;
					}
				}
				break;
			}
		}	
	}
	
	public void viewcashbooks() {
//		System.out.println("날짜를 입력하세요 : ");
//		String date1 = input.next();
		System.out.println("# of registerd cash book date :"+ CashBook.numCashBookDateRegistered);
		for (int i= 0; i<cashbooks.size(); i++) {
			cashbooks.get(i).printInfo();
			
			}	

	}
}
