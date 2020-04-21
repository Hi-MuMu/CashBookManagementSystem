package cashbook;

import java.util.Scanner;

public class FebruaryCashBook extends CashBook {

	public void getUserInput(Scanner input) {
		System.out.println("이번 달은 2월이고 29일 까지 있습니다.");
		
		System.out.println("날짜를 입력하세요 :");
		String date = input.next();
		this.setDate(date);
		
		System.out.println("수입을 입력하세요 :");
		int in = input.nextInt();
		this.setIn(in);
		
		System.out.println("지출을 입력하세요 :");
		int out = input.nextInt();
		this.setOut(out);
		
		int total = in - out;
		System.out.println("총합은 : " + total);
		this.setTotal(total);		
		
	}
}