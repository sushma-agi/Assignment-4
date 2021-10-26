
	import java.util.*;
	public class ExceptionTest extends Exception
	{
	public static void show(int a, int b)
	{



	int x = a;
	int y = b;
	try
	{



	int c = x/y;
	System.out.println(x+" / "+y+ " = " +c);

	}
	catch(ArithmeticException e)
	{
	System.out.println("Divisible by zero");
	}
	catch(Exception e)
	{
	System.out.println("Only integers are allowed"+e);
	}
	}
	public static void main(String args[])
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two numbers");
	int a = scan.nextInt();
	int b = scan.nextInt();
	show(a,b);
	}
	}

