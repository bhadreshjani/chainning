package assignment;
class X
{
	X()
	{
	System.out.println("its call from bsic constructor");
	}
	X(String str)
	{
		System.out.println(str);
	}
	X(int num)
	{
		this("Its call from another constuctor");  // call the other constructor
		num=num+10;
		System.out.println(num);
	}
}

public class chaining {
public static void main(String args[])
{
	X a = new X(25);                   // call constructor which is calling another constructor
	X b = new X("This is direct calling from main");
}
}
