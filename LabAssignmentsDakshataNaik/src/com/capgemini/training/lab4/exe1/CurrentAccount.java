package com.capgemini.training.lab4.exe1;
public class CurrentAccount extends Account {
  final double overDraftLimit=20000;
  
  public void withdraw(double amt)
	{
		if(amt<overDraftLimit)
		    System.out.println("You Can Withdraw");
		else
			System.out.println("Reached limit!.. Can't Withdraw");
	}
  
}
