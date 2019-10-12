import java.util.*;
class Bank
{
	String name;
	String AccNo;
	double balance;
	String Id;

	void setData()
	{	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name :");
		String name=scan.next();
		System.out.println("Enter ACC NO. :");
		String AccNo=scan.next();
		System.out.println("Enter Id :");
		String Id=scan.next();
		System.out.println("Enter balance :");
		double balance=scan.nextDouble();
		this.name=name;
		this.AccNo=AccNo;
		this.balance=balance;
		this.Id=Id;
	}
	
	void withdraw()
	{
		System.out.println("Cannot withdraw!!!");
		
	}

	void cheque()
	{
		System.out.println("Cheque provided!!!");
	}

	void Display()
	{
		System.out.println("Account Information: ");
		System.out.println("__________________________________________");
		System.out.println("Account Holder name:  "+this.name);
		System.out.println("Account Number:  "+this.AccNo);
		System.out.println("Customer Id:  "+this.Id);
		System.out.println("Balance:  "+this.balance);
	}

	void Interest()
	{	
		System.out.println("Interest facility not available!!!");
	}

	void displayBalance()
	{
		System.out.println("The present Balance is : Rs."+balance);
	}
	
	void DepositMoney()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter thr money to be deposited: ");
		double d =scan.nextDouble();
		this.balance=this.balance+d;
	}
}

class SavingsAcc extends Bank
{	
	Scanner scan=new Scanner(System.in);
	void Interest()
	{	
		System.out.println("Enter the term :  ");
		int n=scan.nextInt();
		System.out.println("Enter the rate :  ");
		double r=scan.nextDouble();
		double CI=this.balance*Math.pow((1+(r/100)),n);
		System.out.println("Compound Interest for the present balance and given rate and term is:  "+CI);
	}

	void withdraw()
	{
		System.out.println("Enter the amount to be withdrawed:  ");
		double w=scan.nextDouble();
		this.balance=this.balance-w;
		
	}

	void cheque()
	{
		System.out.println("Sorry,Cheque facility is not allowed!!!");
	}

}

class CurrentAcc extends Bank
{
	double minBal=500.00;
	
}

class lab5
{	
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Which account do you want to create??");
	System.out.println("1)  Savings Account");
	System.out.println("2)  Current Account");
	int ch=scan.nextInt();
	if(ch==1)
	{
		SavingsAcc sa1=new SavingsAcc();
		sa1.setData();int op=0;
		do
		{System.out.println("Enter your option:  ");
		System.out.println("1) To find Compund Interest for present balance");
		System.out.println("2) to withdraw ");
		System.out.println("3) Cheque");
		System.out.println("4) Balance check");
		System.out.println("5) Deposit money");
		System.out.println("6) Exit");
		op=scan.nextInt();
		if(op==1)
		{sa1.Interest();}
		else if(op==2)
		{sa1.withdraw();}
		else if(op==3)
		{sa1.cheque();}
		else if(op==4)
		{sa1.displayBalance();}
		else if(op==5)
		{sa1.DepositMoney();}
		
		}while(op!=6);
	}
	else
	{
		CurrentAcc ca1=new CurrentAcc();
		ca1.setData();int op=0;
		
		double charges=100.00;
		
		if(ca1.balance<500)
		{	System.out.println("The charges levied are: 100.00");
			ca1.balance=ca1.balance-charges;
		}
		do{	
		System.out.println("Enter your option:  ");
		System.out.println("1) To find Interest for present balance");
		System.out.println("2) to withdraw ");
		System.out.println("3) Cheque");
		System.out.println("4) Balance check");
		System.out.println("5) Deposit money");
		System.out.println("6) Exit");
		 op=scan.nextInt();
		if(op==1)
		{ca1.Interest();}
		else if(op==2)
		{ca1.withdraw();}
		else if(op==3)
		{ca1.cheque();}
		else if(op==4)
		{ca1.displayBalance();}
		else if(op==5)
		{ca1.DepositMoney();}	
		}while(op!=6);
		
		
	}
	}

	
}
