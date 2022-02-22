package exception;
import java.util.*;



class withdrawing{
	private int a = 5000;
	public void withdraw(int b) throws InsufficientBalanceException,IllegalBankTransactionException{
		if(b<0) {
			throw new IllegalBankTransactionException("Should not be negative");
		}
		else if(b>a) {
			throw new InsufficientBalanceException("should not more than balance");
		}
		System.out.println(b+" withdrawn");
	}
}

public class Assignment4Q3 {

	public static void main(String[] args) {
		withdrawing amount = new withdrawing();
		int b;
		Scanner s = new Scanner(System.in);
		b = s.nextInt();
		try {
			amount.withdraw(b);
		} catch (IllegalBankTransactionException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (InsufficientBalanceException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
