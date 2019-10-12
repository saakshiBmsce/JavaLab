import java.util.*;
class lab4
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a and b");
		int a=scan.nextInt();int b=scan.nextInt();
		
		Circle c=new Circle(a,b);
		Rectangle r=new Rectangle(a,b);
		Triangle t=new Triangle(a,b);
		c.area();r.area();t.area();
	}
}
abstract class Shape
{
	int a,b;
	
	public abstract void area();
}

class Circle extends Shape
{	
	Circle(){}
	Circle(int a,int b){this.a=a;this.b=b;}
	public void area()
	{
		System.out.println("The area of Circle is  "+(3.14*a*a));
	}
}

class Rectangle extends Shape
{	
	Rectangle(){}
	Rectangle(int a,int b){this.a=a;this.b=b;}
	public void area()
	{
		System.out.println("The area of Rectangle is  "+(b*a));
	}
}

class Triangle extends Shape
{	
	
	Triangle(){}
	Triangle(int a,int b){this.a=a;this.b=b;}
	public void area()
	{
		System.out.println("The area of Triangle is  "+(0.5*b*a));
	}
}


