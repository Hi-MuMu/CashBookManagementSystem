import java.util.InputMismatchException;
import java.util.Scanner;

public class MuneManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CashBookManager cashBookManager = new CashBookManager(input);
		selectMenu(input, cashBookManager);

	}

	public static void selectMenu(Scanner input, CashBookManager cashBookManager) {
		int num = -1;
		while (num != 5) {
			try {
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
			catch (InputMismatchException e) {
				System.out.println("Please put an integer betwwen 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
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
