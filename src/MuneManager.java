import java.util.Scanner;

public class MuneManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CashBookManager cashBookManager = new CashBookManager(input);
	
		int num = 4;
		while (num != 5) {
			showMenu();
			num = input.nextInt();
			switch (num) {
			case 1:
				cashBookManager.addcashbook();
				break;
			case 2:
				cashBookManager.deletecashbook();
				break;
			case 3:
				cashBookManager.editcashbook();
				break;
			case 4:
				cashBookManager.viewCashBooks();
				break;
			default :
				continue;
			}	
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Cash Book Management System Menu ***");
		System.out.println(" 1. Add Cash Book");
		System.out.println(" 2. Delete Cash Book");
		System.out.println(" 3. Edit Cash Book");
		System.out.println(" 4. View Cash Book");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5 :");
	}
}
