package chapter08.Exercise;

public abstract class BankAccount {
	protected int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	// 입금
	// amount 입금액
	public void deposit(int amount) {
		this.balance += amount;
	}

	// 출금
	// amount 출금액
	public boolean withdraw(int amount) {
		if (amount < this.balance) {
		this.balance -= amount;
		return true;
		}
		return false;
	}

	// 이체
	// amount 금액
	// otherAccount 계좌번호
	public boolean transfer(int amount, BankAccount otherAccount) {
		if(withdraw(amount)) {
			otherAccount.deposit(amount);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("%,d", balance);
	}
	abstract String getAccountType();
}
