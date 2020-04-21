import java.util.Scanner;

import cashbook.CashBook;
import cashbook.FebruaryCashBook;

import java.util.ArrayList;

public class CashBookManager {
	ArrayList<CashBook> cashbooks = new ArrayList<CashBook>();
	Scanner input;
	CashBookManager(Scanner input) {
		this.input = input;
	}
	
	public void addcashbook() {
		int kind = 0;
		CashBook cashbook;
		while (kind != 1 && kind != 2){
			System.out.println("1. for January");
			System.out.println("2. for February");
			System.out.println("Select num for Month kind between 1 and 2 :");
			kind = input.nextInt();
			if (kind == 1) {
				cashbook = new CashBook();
				cashbook.getUserInput(input);
				cashbooks.add(cashbook);
				break;
			}
			else if (kind == 2) {
				cashbook = new FebruaryCashBook();
				cashbook.getUserInput(input);
				cashbooks.add(cashbook);
				break;
			}
			else {
				System.out.println("Select num for Month kind between 1 and 2 :");
			}
		}
	}
		

	public void deletecashbook() {
		System.out.println("날짜를 입력하세요 : ");
		String date1 = input.next();
		int index = -1 ;
		for (int i= 0; i<cashbooks.size(); i++) {
			if(date1.equals(cashbooks.get(i).getDate())) {
				index = i; 
				break;
			}	
		}
		if (index >= 0) {
			cashbooks.remove(index);
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
			if(date1.equals(cashbook.getDate())) {
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
					if (num == 1) {
						System.out.println("날짜를 입력하세요 :");
						String date = input.next();
						cashbook.setDate(date);
					}
					else if (num == 2) {
						int in = cashbook.getIn();
						int total = cashbook.getTotal();
						total = total - in;
						System.out.println("수입을 입력하세요 :");
						in = input.nextInt();
						cashbook.setIn(in);
						total = total + in;
						cashbook.setTotal(total);
					}
					else if (num == 3) {
						int out = cashbook.getIn();
						int total = cashbook.getTotal();
						total = total + out;
						System.out.println("지출을 입력하세요 :");
						out = input.nextInt();
						cashbook.setOut(out);
						total = total - out;
						cashbook.setTotal(total);
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
		System.out.println("# of registerd cash book date :"+ cashbooks.size());
		for (int i= 0; i<cashbooks.size(); i++) {
			cashbooks.get(i).printInfo();
			
			}	

	}
}

