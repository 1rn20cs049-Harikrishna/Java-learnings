package Oops_Concepts.Inheritence;
/*
 * constructor execution in case of inheritance.
 */

class Parentt
{
	int a, b;
	
	Parentt()
	{
		
		a=10;
		b=20;
		System.out.println("Parentt Const");
	}
	Parentt(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Parentt para Const");
	}
	
}

class Childd extends Parentt
{
	
	int x, y;
	
	Childd()
	{
		this(111,222);
		x=100;
		y=200;
	}
	Childd(int x, int y)
	{
		super(111,222);
		this.x=x;
		this.y=y;
	}
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
		
	}
}
public class Example3 {

	public static void main(String[] args) {
		
		Childd ch=new Childd();
		ch.disp();
		Childd ch1=new Childd(1000,2000);
		ch1.disp();
		
	}

}

