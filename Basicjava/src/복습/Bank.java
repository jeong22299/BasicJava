package 복습;


public class Bank {
	private Customer[] customers; //초기화를 시켜줘야 함
	private int numberofCustomers;//고객들의 수
	
	
	public Bank() {
		customers = new Customer[10];
	}
	
	//메소드
	public void addCustomer(Customer customer) {
		customers [numberofCustomers++] = customer;
	}
	
	public Customer[] getCustomers() {
		return customers;
	}
	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}
	
	public int getNumberOfCustomers() {
		return numberofCustomers;
	}

	public Customer getCustomer(int index) {
		return customers [index];
	}


}

