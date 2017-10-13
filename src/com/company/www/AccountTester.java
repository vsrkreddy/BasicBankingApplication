package com.company.www;

public class AccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount savingsAccount = new SavingsAccount(100,0.02);
		
		System.out.println("#################################SAVINGS ACCOUNT#################################\n");

		System.out.println("**************************CalculateIntrest**************************************");
		System.out.println("Initial Balance in your account:" +savingsAccount.getBalance());
		System.out.println("Intrest Percentage: "+ savingsAccount.getIrate()+"%");
		System.out.println("IntrestAmount: "+savingsAccount.calculateIntrest());
		double a = savingsAccount.getBalance();
		double b = savingsAccount.calculateIntrest();
		double c = a+b;
		savingsAccount.setBalance(c);
		System.out.println("Added Intrest Amount to Balance, Total Balance: "+savingsAccount.getBalance());
		
		System.out.println("***************************Credit*************************************");
//		System.out.println("Adding Amount to Balance: ");
		savingsAccount.credit(20.2);
		System.out.println("Balance Now After Crediting: "+savingsAccount.getBalance());
//		System.out.println("Adding  Negative Amount to Balance: ");
		savingsAccount.credit(-20.2);
		System.out.println("Balance Now After Crediting: "+savingsAccount.getBalance());
		
		
		System.out.println("**************************Debit**************************************");
//		System.out.println("Withdrawl Amount from Balance: ");
		savingsAccount.debit(20.2);
		System.out.println("Balance Now After withdrawl: "+savingsAccount.getBalance());
//		System.out.println("withdrawl of Negative Amount to Balance: ");
		savingsAccount.debit(-20.2);
		System.out.println("Balance Now After Withdrawl: "+savingsAccount.getBalance());
//		System.out.println("Trying to withdrawl more than balance:");
		System.out.println(savingsAccount.debit(102.2));
		
		System.out.println("****************************************************************");
		System.out.println("#################################CHECKINGS ACCOUNT#################################\n");

		CheckingsAccount checkingsAccount = new CheckingsAccount(100, 1.0);
		System.out.println("Initial Balance in your account:" +checkingsAccount.getBalance());
		System.out.println("Transaction Fee: "+checkingsAccount.getFeePerTransaction());
		System.out.println("***************************Credit*************************************");
//		System.out.println("Adding Amount to Balance: ");
		checkingsAccount.credit(20.2);
		System.out.println("Balance Now After Crediting: "+checkingsAccount.getBalance());
//		System.out.println("Adding  Negative Amount to Balance: ");
		checkingsAccount.credit(-20.2);
		System.out.println("Balance Now After Crediting: "+checkingsAccount.getBalance());
		
		
		System.out.println("**************************Debit**************************************");
		System.out.println("Transaction Fee: "+checkingsAccount.getFeePerTransaction());
		System.out.println("Withdrawl Amount from Balance: It will include transaction fee ");
		checkingsAccount.debit(20.2);
		System.out.println("Balance Now After withdrawl: "+checkingsAccount.getBalance());
//		System.out.println("withdrawl of Negative Amount to Balance: ");
		checkingsAccount.debit(-20.2);
		System.out.println("Balance Now After Withdrawl: "+checkingsAccount.getBalance());
		System.out.println("Trying to withdrawl more than balance:");
		System.out.println(checkingsAccount.debit(102.2));
		
	}

}
