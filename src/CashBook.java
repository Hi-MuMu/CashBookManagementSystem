public class CashBook {
	String[] date = new String[100];
	int[] incomings = new int[100];
	int[] outgoings = new int[100];
	static int total = 0;
	int sum;
	int Minus;
	
	public CashBook() {
		
	}
	
	public CashBook(String date[],int incomings[], int outgoings[], int total) {

		this.date = date;
		this.incomings = incomings;
		this.outgoings = outgoings;
		this.total = total;
	}
	
	public void define() {
		sum = 0;
		Minus = 0;
		total = 0;
	}
	public void printInfo() {
		System.out.println("총수입 :" +sum);
		System.out.println("총지출 :" +Minus);
		System.out.println("합계 :" +total);
	}
}
