package com.braindata.bankmanagement.client;
import com.braindata.bankmanagement.servicempl.Sbi;
import com.braindata.bankmanagement.servive.Rbi;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Rbi bank=new Sbi();
		
		Scanner sc1=new Scanner(System.in);
		do
		{
			System.out.println("Enter Your Choice=1.CreateAccount 2.displayAllDetails 3.depositeMony 4.withDrawal 5.balanceCheck 6.Exit:");	
			System.out.println("Choice is Yours:");
			int q=sc1.nextInt();
		
		switch(q)
		{
		case 1:
			bank.createAccount();
			break;
			case 2:
				bank.displayAllDetails();
				break;
			case 3:
				bank.depositeMony();
				break;
			case 4:
				bank.withDrawal();
				break;
			case 5:
				bank.balanceCheck();
				break;
			case 6:
				System.exit(0);
				
			default:
				System.out.println("That is not a valid option. Please choose again.");	
		}
		
		}while(true);
	}
}
