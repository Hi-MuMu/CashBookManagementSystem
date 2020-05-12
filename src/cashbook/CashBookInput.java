package cashbook;

import java.util.Scanner;

public interface CashBookInput {
	
	public String getDate();
	
	public int getTotal();
	
	public int getOut();
	
	public int getIn();
	
	public int getSuminout();
	
	public void setIn(int in);
	
	public void setOut(int out);
	
	public void setSuminout(int suminout);
	
	public void setDate(String date);
	
	public void setUserInput(Scanner input);
	
	public void printInfo();
	
	public void setCashBookIn(Scanner input);
	
	public void setCashBookDate(Scanner input);
	
	public void setCashBookOut(Scanner input);
	
	public void setCashBookSum(Scanner input);
}
