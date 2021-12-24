
public class ReverseStrBuilder {
	public static void main(String[] args)
	{

		StringBuilder str
			= new StringBuilder("This method returns the reversed object on which it was called ");

		System.out.println("String = "+ str.toString());

		StringBuilder reverseStr = str.reverse();

		System.out.println("Reverse String = "+ reverseStr.toString());
	}

    }
