package com.braindata.bankmanagement.modell;

	public class Account
	{
		private int accno;
		private String name;
		private long mobno;
		private long adharno;
		private String gender;
		private int age;
		private double balance=500;
		
		public void setAccno(int accno)
		{
			this.accno=accno;
		}
		public int getAccno()
		{
			return accno;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public String getName()
		{
			return name;
		}
		public void setMobno(Long mobno)
		{
			this.mobno=mobno;
		}
		public long getMobno()
		{
			return mobno;
		}
		public void setAdharno(long adharno)
		{
			this.adharno=adharno;
		}
		public long getAdharno()
		{
			return adharno;
		}
		public void setGender(String gender)
		{
			this.gender=gender;
		}
		public String getGender()
		{
			return gender;
		}
		public void setAge(int age)
		{
			this.age=age;
		}
		public int getAge()
		{
			return age;
		}
		public void setBalance(double balance)
		{
			this.balance=balance;
		}
		public double getBalance()
		{
			return balance;
		}
	
	}


