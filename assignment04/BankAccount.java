package assignment04;

public class BankAccount {
	private double balance;
	private int id;
	private Person customer;
	private static int nextID=0;

	public BankAccount(double initialBalance) {
		balance = initialBalance;
		id = ++nextID;
	}
	public void deposit(double amount) {  
		balance += amount;
	}
	public void withdraw(double amount) { 
		balance -= amount;
	}
	public double getBalance() {   
		return balance;
	}

	public int getID(){
		return id;
	}
	public Person getCustomer(){
		return customer;
	}

	public void setCustomer(Person p){
		customer=p;
	}
}