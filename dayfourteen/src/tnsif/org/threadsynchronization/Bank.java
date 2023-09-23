package tnsif.org.threadsynchronization;

public interface Bank {
	
	
 static final int DEPOSIT_LIMIT=25000;
	static final int MINIMUM_BALANCE=1000;
	public  void deposit(int amount) throws  DepositLimitExceedsException;
	void withdraw(int amount) throws InsufficientBalanceException;
	

}
