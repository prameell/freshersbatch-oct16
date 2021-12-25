import java.util.Scanner;

public class IncomeAmount {

	public static void main(String args[])
	{
	// int x;
	float r,x;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter income");
	x=s.nextInt();

	if(x>500000)
	{
		r=x*(0.3f);
		System.out.println(r);
	}
	else if(x>300000)
	{
		r=x*(0.2f);
		System.out.println(r);
	}
	else if(x>180000)
	{
		r=x*(0.1f);
		System.out.println(r);
	}
	else
	{
		System.out.println("no tax");
	}

	}
	
}
