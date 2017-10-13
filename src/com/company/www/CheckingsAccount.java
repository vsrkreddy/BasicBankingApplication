package com.company.www;

public class CheckingsAccount extends Account {
	
	private double feePerTransaction=0;
	
	

	public CheckingsAccount(double amount, double feePerTransaction) {
		super(amount);
		this.setFeePerTransaction(feePerTransaction);
	}
	//subclass methods
	public double debit(double withdrawlamount){
		
		double amount=0;
		if(withdrawlamount < 0){
			System.out.println("Error entered negative amount, please enter it in positive");
			return getBalance();
		}else{
			if(withdrawlamount > getBalance()){
				//Doesn't change balance
				System.out.println("Debit balance exceeded amount balance.");
				System.out.println("*************************************************");
				}else{
					double total = getBalance()-withdrawlamount;
					total = total - getFeePerTransaction();
					setBalance(total);
					amount = getBalance();
				}
			return amount;
		}
	}
	//subclass methods
	public double credit(double amount){
		if(amount < 0){
			System.out.println("Error entered negative amount, please enter it in positive");
			return getBalance();
		}else{
			double total = getBalance()+ amount;
			setBalance(total);
			return getBalance();
		}
	}
	public double getFeePerTransaction() {
		return feePerTransaction;
	}
	public void setFeePerTransaction(double feePerTransaction) {
		this.feePerTransaction = feePerTransaction;
	}
	

}
