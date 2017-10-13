package com.company.www;

 

public class Account implements IBalance {
	
	private double balance=0;
	
	
	
	public Account(double balance){
		this.balance = balance;
	}
	
	@Override
	public double getBalance() {
		
//		System.out.println("The Balance in your account is: " +balance);
		return balance;
		
	}
	
	
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double debit(double withdrawlamount){
		if(withdrawlamount < 0){
			System.out.println("Error entered negative amount, please enter it in positive");
			return balance;
		}else{
			if(withdrawlamount > balance){
				//Doesn't change balance
				System.out.println("Debit balance exceeded amount balance. only balance available is:");
				}else{
					balance = balance - withdrawlamount;
				}
			return balance;
		}
	}
	
	public double credit(double amount){
		if(amount < 0){
			System.out.println("Error entered negative amount, please enter it in positive");
			return balance;
		}else{
			balance= balance + amount;
			return balance;
		}
	}
	

	

}
