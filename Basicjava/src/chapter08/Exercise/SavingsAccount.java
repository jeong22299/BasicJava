package chapter08.Exercise;

public class SavingsAccount extends BankAccount {
	private double interestRate;// 이자율

	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	public void updateBalance(int period) {
		this.balance += this.balance * interestRate * period;
	}
	@Override
	String getAccountType() {
		return "저축예금";
	}
	
}