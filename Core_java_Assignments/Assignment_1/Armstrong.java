
public class Armstrong {

	public static void main(String[] args) {
		int n=153,r,c,sum=0, temp;
		temp=n;
		while(n>0)
		{
		r=n%10;
		c=r*r*r;
		sum=sum+c;
		n=n/10;
		}
		if(temp == sum)
		System.out.println(temp +" is an Armstrong number");
		else
		System.out.println(temp + " is not an Armstrong number");

	}

}
