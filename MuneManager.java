import java.util.Scanner;

public class MuneManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;
		while (num != 6) {
			System.out.println("*** Cash Book Management System Menu ***");
			System.out.println(" 1. Add Cash Book");
			System.out.println(" 2. Delete Cash Book");
			System.out.println(" 3. Edit Cash Book");
			System.out.println(" 4. View Cash Book");
			System.out.println(" 5. Show a menu");
			System.out.println(" 6. Exit");
			System.out.println("Select one number between 1 - 5 :");
			num = input.nextInt();
			if (num==1) {
				addcashbook();
			}
			else if (num==2) {
				deletecashbook();
			}
			else if (num==3) {
				editcashbook();
			}
			else if (num==4) {
				viewcashbook();
			}
			else {
				continue;
			}
		}
	}
	public static void addcashbook() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a date :");
		String date = input.nextLine();
		System.out.print("incomings : ");
		int incomings = input.nextInt();
		System.out.println("incomings : " + incomings);
		int z = 0;
		z = z + incomings;
		System.out.print("outgoings : ");
		int outgoings = input.nextInt();
		System.out.println("outgoings : " + outgoings);
		z = z - outgoings;
		System.out.println("balence : " + z);
	}
	public static void deletecashbook() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a date :");
		String date = input.nextLine();
	}
	public static void editcashbook() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a date :");
		String date = input.nextLine();
	}
	public static void viewcashbook() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a date :");
		String date = input.nextLine();
	}
}
