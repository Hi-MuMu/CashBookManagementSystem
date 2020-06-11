package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MuneManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		CashBookManager cashBookManager = getObject("cashbookmanager.ser");
		if(cashBookManager == null) {
			cashBookManager = new CashBookManager(input);
		}
		else {
			cashBookManager.setScanner(input);
		}
		// new CashBookManager(input);
		
		WindowFrame frame = new WindowFrame(cashBookManager);
		selectMenu(input, cashBookManager);
		putObject(cashBookManager, "cashbookmanager.ser");

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
					logger.log("add a cashbook");
					break;
				case 2:
					cashBookManager.deletecashbook();
					logger.log("delete a cashbook");
					break;
				case 3:
					cashBookManager.editcashbook();
					logger.log("edit a cashbook");
					break;
				case 4:
					cashBookManager.viewCashBooks();
					logger.log("view a cashbook");
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

	public static CashBookManager getObject(String filename) {
		CashBookManager cashBookManager = null;

		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			cashBookManager = (CashBookManager) in.readObject();

			in.close();
			file.close();

		} catch (FileNotFoundException e) {
			return cashBookManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cashBookManager;
	}
	public static void putObject(CashBookManager cashBookManager, String filename) {


		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(cashBookManager);

			out.close();
			file.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
