package 복습;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}
	/*
	 * SavingsAccount : 5000원
	 * CheckingAccount : 10000원
	 * 1. 백지수표로 7000원짜리 물건을 구매한 경우
	 * 
	 * 2. 백지수표료 13000 원짜리 물건을 구매한 경우
	 * SavingsAccount -(amount - CheckingAccount)
	 * CheckingAccount는 0으로 만든다
	 */
	
	public  boolean withdrow(int amount) {
		if (!super.withdraw(amount)) {
			protectedBy.withdraw(amount - this.balance);
			protectedBy.balance -= amount - this.balance;
			this.balance = 0;
		}
		return true;
	}

}
