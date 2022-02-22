package exception;

public class IllegalBankTransactionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public IllegalBankTransactionException(String a)
	{
		super(a);
	}
}