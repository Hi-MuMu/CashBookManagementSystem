import java.util.Scanner;

public class MuneManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CashBookManager cashBookManager = new CashBookManager(input);
	
		int num = 4;
		while (num != 5) {
			System.out.println("*** Cash Book Management System Menu ***");
			System.out.println(" 1. Add Cash Book");
			System.out.println(" 2. Delete Cash Book");
			System.out.println(" 3. Edit Cash Book");
			System.out.println(" 4. View Cash Books");
			System.out.println(" 5. Exit");
			System.out.println("Select one number between 1 - 5 :");
			num = input.nextInt();
			if (num==1) {
				cashBookManager.addcashbook();
			}
			else if (num==2) {
				cashBookManager.deletecashbook();
			}
			else if (num==3) {
				cashBookManager.editcashbook();
			}
			else if (num==4) {
				cashBookManager.viewcashbooks();
			}
			else {
				continue;
			}
		}
	}
}
