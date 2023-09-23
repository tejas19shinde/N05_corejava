package tnsif.org.threadsynchronization;

public class DepositLimitExceedsException extends Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DepositLimitExceedsException() {
		super("Deposit limit exceeded.....");
	}

	public DepositLimitExceedsException(String message) {
		super(message);
	}
}