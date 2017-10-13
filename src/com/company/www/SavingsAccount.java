package com.company.www;

public class SavingsAccount extends Account {
	private double irate=0;
	
	
	
	public SavingsAccount(double balance, double irate) {
		super(balance);
		this.irate = irate;
		// TODO Auto-generated constructor stub
	}
	
	
	public double getIrate() {
		return irate;
	}


	public double calculateIntrest(){
		
		double intrestAmount = irate * getBalance();
		
		return intrestAmount;
	}
	
	
	
	
	

}
