package com.braindata.bankmanagement.servicempl;
import java.util.Scanner;
import com.braindata.bankmanagement.modell.Account;
import com.braindata.bankmanagement.servive.Rbi;

public class Sbi implements Rbi{
	Scanner sc=new Scanner(System.in);
	Account s=new Account();
	public void createAccount()
	{
		System.out.println("Enter customer accno:");
		int a=sc.nextInt();
		s.setAccno(a);
		System.out.println("Enter customer Name:");
		String a1=sc.next();
		s.setName(a1);
		System.out.println("Enter customer Mobno:");
		long a2=sc.nextLong();
		s.setMobno(a2);
		System.out.println("Enter customer Adharno:");
		long a3=sc.nextLong();
		s.setAdharno(a3);
		System.out.println("Enter customer Gender:");
		String a4=sc.next();
		s.setGender(a4);
		System.out.println("Enter customer age:");
		int a5=sc.nextInt();
		s.setAge(a5);
		System.out.println("Enter customer balance:");
		double a6=sc.nextDouble();
		s.setBalance(s.getBalance()+a6);
	}
	public void displayAllDetails()
	{
		System.out.println("AccNo   :"+s.getAccno());
		System.out.println("Name    :"+s.getName());
		System.out.println("MobNo   :"+s.getMobno());
		System.out.println("AdharNo :"+s.getAdharno());
		System.out.println("Gender  :"+s.getGender());
		System.out.println("Age     :"+s.getAge());
		System.out.println("Balance :"+s.getBalance());
	}
	public void depositeMony()
	{	
		
		System.out.println("Enter deposit");
		double balance=sc.nextDouble();
		s.setBalance(s.getBalance() + balance);
		System.out.println("After Deposit Amount in Account. The balance is:"+s.getBalance());
	}
	public void withDrawal()
	{
		System.out.println("Enter Widrawal");
		double balance =sc.nextDouble();
		if(balance<s.getBalance())
		{
			s.setBalance(s.getBalance() - balance);
		}
		else
		{
			System.out.println("Insufficient Balance and you Enter Greater amount than remaining balance");
		}
		
	}
	public void balanceCheck()
	{	
		System.out.println(s.getBalance());
		
	}
}
