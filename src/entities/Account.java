package entities;

import exceptions.PersonalException;

public class Account {

	private Integer number;
	private String holder;
	private double balance;
	private double withDrawLimit;
	
	public Account() {
		
	}	
	
	public Account(Integer number, String holder, double balance, double withDrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}	

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}		

	public double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
	public double getBalance() {
		return balance;
	}

	public void deposit(Double amount) {		
		balance = balance + amount;		
	}
	
	public void withdraw(double amount) {			
		
		validateWithdraw(amount);
		balance = balance-amount;
		
	}
	
	public void validateWithdraw(double amount) {
		
		if(amount > withDrawLimit || amount > balance) {
			throw new PersonalException("Limite de saque excedido!");
		}		
	}

	public String toString() {
		return "N da conta: "+number+" ,holder: "+holder+" ,balance: "+balance+" ,Withdraw limit: "+withDrawLimit+"";
	}
	
}
