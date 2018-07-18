package com.hackercode.utility;
import com.hackercode.usserDefineException.InsufficientFundsException;
public class checkingFee {
	private double balance;
	private double deposite;
	private int fee;
	//private Object needs;
	public checkingFee(int fee) {
		this.fee=fee;
		}
	public void deposit(double deposite) {
		this.deposite+=deposite;
	}
	public void feeLeft(double left )throws InsufficientFundsException{
		balance=fee-deposite;
		if(balance<=left) {
			System.out.println("give admit card");
		}
		else {
			///System.out.print("no admit card given please submit the fee");
			throw new InsufficientFundsException(balance);
		}
		}
	
	}



