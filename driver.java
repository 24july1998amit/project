package com.hackercode.controller;
import com.hackercode.utility.*;
import java.util.Scanner;
import com.hackercode.usserDefineException.InsufficientFundsException;
public class driver {
	public static void main(String aegs[]) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter total fee");
		int fe=scr.nextInt();
				
		checkingFee c=new checkingFee(fe);
		System.out.println("enter the fee deposited");
		int de=scr.nextInt();
		c.deposit(de);
		try {
			c.feeLeft(1200);
		}
		catch(InsufficientFundsException e){
			System.out.println("no admit card plese depposite the fee left "+e.getBalance());
		}
}
	

}
