package cashbook;

import java.util.Scanner;

public class FebruaryCashBook extends CashBook {

	public void getUserInput(Scanner input) {
		System.out.println("�̹� ���� 2���̰� 29�� ���� �ֽ��ϴ�.");
		
		System.out.println("��¥�� �Է��ϼ��� :");
		String date = input.next();
		this.setDate(date);
		
		System.out.println("������ �Է��ϼ��� :");
		int in = input.nextInt();
		this.setIn(in);
		
		System.out.println("������ �Է��ϼ��� :");
		int out = input.nextInt();
		this.setOut(out);
		
		int total = in - out;
		System.out.println("������ : " + total);
		this.setTotal(total);		
		
	}
}