package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import cashbook.CashBook;
import cashbook.CashBookInput;
import cashbook.CashBookKind;
import cashbook.ClubCashBook;
import cashbook.FamilyCashBook;
import cashbook.MuseongCashBook;

public class CashBookManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7313458216165738267L;

	ArrayList<CashBookInput> cashbooks = new ArrayList<CashBookInput>();
	transient Scanner input;
	CashBookManager(Scanner input) {
		this.input = input;
	}	

	public void setScanner(Scanner input) {
		this.input = input;
	}


	public void addcashbook() {
		int kind = 0;
		CashBookInput cashbookInput;
		while (kind != 1 && kind != 2 && kind != 3){
			try {
				System.out.println("1. for Museong CashBook ");
				System.out.println("2. for Club CashBook ");
				System.out.println("3. for Family CashBook ");
				System.out.println("Select num 1, 2, or 3 for CashBook kind: ");
				kind = input.nextInt();
				if (kind == 1) {
					cashbookInput = new MuseongCashBook(CashBookKind.Museong);
					cashbookInput.setUserInput(input);
					cashbooks.add(cashbookInput);
					break;
				}
				else if (kind == 2) {
					cashbookInput = new ClubCashBook(CashBookKind.Club);
					cashbookInput.setUserInput(input);
					cashbooks.add(cashbookInput);
					break;
				}
				else if (kind == 3) {
					cashbookInput = new FamilyCashBook(CashBookKind.Family);
					cashbookInput.setUserInput(input);
					cashbooks.add(cashbookInput);
					break;
				}
				else {
					System.out.println("Select num 1, 2, or 3 for CashBook kind: ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer betwwen 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}


	public void deletecashbook() {
		System.out.println("날짜를 입력하세요 : ");
		String cashbookDate = input.next();
		int index = findIndex(cashbookDate);
		remvefromCashBooks(index, cashbookDate);
	}

	public int findIndex(String cashbookDate) {
		int index = -1 ;
		for (int i= 0; i<cashbooks.size(); i++) {
			if(cashbookDate.equals(cashbooks.get(i).getDate())) {
				index = i; 
				break;
			}	
		}
		return index;
	}

	public int remvefromCashBooks(int index, String cashbookDate) {
		if (index >= 0) {
			cashbooks.remove(index);
			System.out.println("The cash book " + cashbookDate + "is deleted");
			return 1;
		}
		else {
			System.out.println("The cash book has not been registerd ");
			return -1;
		}	
	}

	public void editcashbook() {
		System.out.println("날짜를 입력하세요 : ");
		String date1 = input.next();
		for (int i= 0; i<cashbooks.size(); i++) {
			CashBookInput cashbook = cashbooks.get(i);
			if(date1.equals(cashbook.getDate())) {
				int num = 5;
				while (num != 4) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						cashbook.setCashBookDate(input);
						break;
					case 2:
						cashbook.setCashBookIn(input);
						break;
					case 3:
						cashbook.setCashBookOut(input);
						break;
					default:
						continue;
					}
				} // while
				break;
			} // if
		} // for	
	}

	public void viewCashBooks() {
		System.out.println("# of registerd cash book date :"+ cashbooks.size());
		for (int i= 0; i<cashbooks.size(); i++) {
			cashbooks.get(i).printInfo();	
		}

//		System.out.println("Museong 가계부의 총합은 : "+cashbooks.get(0).getTotal());
	}
	
	public int size() {
		return cashbooks.size();
	}
	
	public CashBookInput get(int index) {
		return (CashBook) cashbooks.get(index);
	}

	public void showEditMenu() {
		System.out.println("** Cash Book Info Edit Menu **");
		System.out.println(" 1. Edit date");
		System.out.println(" 2. Edit incomings");
		System.out.println(" 3. Edit outgoings");
		System.out.println(" 4. Exit");
		System.out.println("Select one number between 1 - 4 :");
	}

}
