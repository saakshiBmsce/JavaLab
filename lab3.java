import java.util.*;
class SGPA
{
	int m[]=new int[5];
	int c[]=new int[5];
	double sgpa;
	String name;
	String USN;
	public void getData(int m[],int c[],String name,String USN)
	{	
		this.m=m;this.c=c;this.name=name;this.USN=USN;
	}
	public void calcSGPA()
	{
		int totCredits=0;
		
		int gm[]=new int[5];
		int tot=0;
		for(int i=0;i<5;i++)
		{
			if(m[i]>=90)gm[i]=10;
			else if(m[i]>=76 &&m[i]<=89)gm[i]=9;
			else if(m[i]>=61 &&m[i]<=75)gm[i]=8;
			else if(m[i]>=51 &&m[i]<=60)gm[i]=7;
			else if(m[i]>=40 &&m[i]<=50)gm[i]=5;
			else gm[i]=0;
		}
		for(int i=0;i<5;i++)
		{
			totCredits=totCredits+c[i];
		}
		for (int i=0;i<5;i++)
		{
			tot=tot+(gm[i]*c[i]);
		}
		System.out.println("totCredits: "+totCredits);
		System.out.println("tot: "+tot);
		sgpa=(double)tot/totCredits;
		
	}
	public void display()
	{
	System.out.println("\n\n\n\n");
	System.out.println("Student Info:");
	System.out.println("_____________________________________");
	System.out.println("name: "+name);
	System.out.println("USN : "+USN);
	System.out.println("SGPA: "+sgpa);	
	}
}


public class lab3
{
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	SGPA s1=new SGPA();
	int m[]=new int[5];int c[]=new int[5];
	System.out.println("Enter students name:  ");
	String name=scan.next();
	System.out.println("Enter students USN:  ");
	String USN=scan.next();
	System.out.println("Enter marks:  ");
	for(int i=0;i<5;i++)
	{m[i]=scan.nextInt();
	}
	System.out.println("Enter credits:  ");
	for(int i=0;i<5;i++)
	{c[i]=scan.nextInt();
	}
	s1.getData(m,c,name,USN);
	s1.calcSGPA();
	s1.display();
	
	
	}
}

