import java.util.Scanner;

import cashbook.CashBook;
import cashbook.CashBookKind;
import cashbook.ClubCashBook;
import cashbook.FamilyCashBook;

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
		while (kind != 1 && kind != 2 && kind != 3){
			System.out.println("1. for Museong CashBook ");
			System.out.println("2. for Club CashBook ");
			System.out.println("3. for Family CashBook ");
			System.out.println("Select num 1, 2, or 3 for CashBook kind: ");
			kind = input.nextInt();
			if (kind == 1) {
				cashbook = new CashBook(CashBookKind.Museong);
				cashbook.setUserInput(input);
				cashbooks.add(cashbook);
				break;
			}
			else if (kind == 2) {
				cashbook = new ClubCashBook(CashBookKind.Club);
				cashbook.setUserInput(input);
				cashbooks.add(cashbook);
				break;
			}
			else if (kind == 3) {
				cashbook = new FamilyCashBook(CashBookKind.Family);
				cashbook.setUserInput(input);
				cashbooks.add(cashbook);
				break;
			}
			else {
				System.out.println("Select num 1, 2, or 3 for CashBook kind: ");
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
					System.out.println(" 4. Edit Suminout");
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
						int Suminout = cashbook.getSuminout();
						Suminout = Suminout - in;
						System.out.println("수입을 입력하세요 :");
						in = input.nextInt();
						cashbook.setIn(in);
						Suminout = Suminout + in;
						cashbook.setSuminout(Suminout);
					}
					else if (num == 3) {
						int out = cashbook.getIn();
						int suminout = cashbook.getSuminout();
						suminout = suminout + out;
						System.out.println("지출을 입력하세요 :");
						out = input.nextInt();
						cashbook.setOut(out);
						suminout = suminout - out;
						cashbook.setSuminout(suminout);
					}
					else {
						continue;
					}
				}
				break;
			}
		}	
	}
	
	public void serchcashbook() {
		System.out.println("날짜를 입력하세요 : ");
		String date1 = input.next();
		for (int i= 0; i<cashbooks.size(); i++) {
			CashBook cashbook = cashbooks.get(i);
			if(date1.equals(cashbook.getDate())) {
				cashbooks.get(i).printInfo();
				break;
			}
			else if (i == cashbooks.size() -1) {
				System.out.println("찾으시는 날짜의 정보가 없습니다.");
			}
		}
	}
	
	public void allprintInfocashbooks() {

		System.out.println("# of registerd cash book date :"+ cashbooks.size());
		for (int i= 0; i<cashbooks.size(); i++) {
			cashbooks.get(i).printInfo();	
			}
		
		System.out.println("Museong 가계부의 총합은 : "+cashbooks.get(0).getTotal());
	}
}

