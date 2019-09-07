import java.util.*;
class Bank
{
	String name;
	String AccNo;
	double balance;
	String Id;

	void setData(String name,String AccNo,double balance,String Id)
	{
		this.name=name;
		this.AccNo=AccNo;
		this.balance=balance;
		this.Id=Id;
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
		System.out.println("Enter the term :  ");
		int n=scan.nextInt();
		System.out.println("Enter the rate :  ");
		double r=scan.nextDouble();
		double SI=this.balance*r*n;
		System.out.println("Simple Interest for the present balance and given rate and term is:  "+SI);
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
		int w=scan.nextDouble();
		this.balance()=this.balance-w;
		
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

class Bank_demo
{
	Scanner scan=new Scanner(System.in);
	Sytem.out.println("Which account do you want to create??");
	System.out.println("1)  Savings Account");
	System.out.println("2)  Current Account");
	int ch=scan.nextInt();
	if(ch==1)
	{
		SavingsAcc sa1=new SavingsAcc();
		sa1.getData();
		System.out.println("Enter your option:  ");
		System.out.println("1) To find Compund Interest for present balance");
		System.out.println("2) to withdraw ");
		System.out.println("3) Cheque");
		int op=scan.nextInt();
		if(op==1)
		{sa1.CompoundInterest();}
		else if(op==2)
		{sa1.withdraw();}
		else if(op==3)
		{sa1.cheque();}
	}
	else
	{
		CurrentAcc ca1=new CurrentAcc();
		ca1.getData();
		double charges=100.00;
		if(ca1.balance<)
		{
			ca1.balance=ca1.balance-charges;
		}	
		ca1.Display();	
		System.out.println("The charges levied are: 100.00");
		System.out.println("Simple Interest to be calculated:(Y/N) ");
		char ch=scan.next().charAt(0);
		if(ch=='Y'||ch=='y')
			{}
	}

	
}
