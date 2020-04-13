public class CashBook {
	String date;
	int in;
	int out;
	int total;	
	
	public CashBook() {
	}
	
	public CashBook(String date) {
		this.date = date;
	}
	
	public CashBook(String date, int in, int out, int total) {
		this.date = date;
		this.in = in;
		this.out = out;
		this.total = total;
	}
	public void printInfo() {
		System.out.println("날짜는 :" + date);
		System.out.println("수입은 :" + in);
		System.out.println("지출은 :" + out);
		System.out.println("총합은 :" + total);
	}
}
