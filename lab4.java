import java.util.*;
class Book
{
	String name;
	String author;
	double price;
	int num_pages;
	public void get_data()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter books name:  ");
		this.name=scan.next();
		System.out.println("Enter author's name:  ");
		this.author=scan.next();
		System.out.println("Enter book's price:  ");
		this.price=scan.nextDouble();
		System.out.println("Enter the number of pages of book:  ");
		this.num_pages=scan.nextInt();
	}
	
	public String toString()
	{
		String s=new String();
		s="Book description: \n1)Book name: "+this.name+"\n2)Author's name: "+
		 this.author+"\n3)Price: "+this.price+"\n4)no of pages:  "+this.num_pages+"";
		
		return s;
	}

}

class lab4
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr the number of objects:  ");
		int n=scan.nextInt();
		Book b[]=new Book[n];
		for(int i=0;i<n;i++)
		{
			b[i]=new Book();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+i+" book details: ");
			b[i].get_data();

			System.out.println(b[i]);
		}
		
	}
}
