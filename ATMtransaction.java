// ATM TRANSACTION 

// Java Program to Display the ATM Transaction 
import java.io.*;  //LIBRARIES
public class ATMtransaction {   //CLASS

	// Display current balance in account 
	public static void displayBalance(int balance) 
	{ 
		System.out.println("Current Balance : " + balance); 
		System.out.println(); 
	} 

	// Withdraw amount and update the balance 
	public static int amountWithdrawing(int balance, 
										int withdrawAmount) 
	{ 
		System.out.println("Withdrawn Operation:"); 
		System.out.println("Withdrawing Amount : "
						+ withdrawAmount); 
		if (balance >= withdrawAmount) { 
			balance = balance - withdrawAmount; 
			System.out.println( 
				"Please collect your money and collect the card"); 
			displayBalance(balance); 
		} 
		else { 
			System.out.println("Sorry! Insufficient Funds"); 
			System.out.println(); 
		} 
		return balance; 
	} 

	// Deposit amount and update the balance 
	public static int amountDepositing(int balance, 
									int depositAmount) 
	{ 
		System.out.println("Deposit Operation:"); 
		System.out.println("Depositing Amount : "
						+ depositAmount); 
		balance = balance + depositAmount; 
		System.out.println( 
			"Your Money has been successfully deposited"); 
		displayBalance(balance); 
		return balance; 
	} 

	public static void main(String args[]) 
	{ 
		int balance = 10000; 
		int withdrawAmount = 5000; 
		int depositAmount = 2000; 

		// calling display balance 
		displayBalance(balance); 
		// withdrawing amount 
		balance 
			= amountWithdrawing(balance, withdrawAmount); 
		// depositing amount 
		balance = amountDepositing(balance, depositAmount); 
	} 
}