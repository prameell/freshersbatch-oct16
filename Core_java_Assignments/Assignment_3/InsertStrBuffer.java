
public class InsertStrBuffer {
	
	public static void main(String[] args)
	{
		StringBuffer str =
			new StringBuffer("it is used to at the specified index position");
		System.out.println("string = " + str);

		str.insert(13, " insert text");

		System.out.print("After insertion = ");
		System.out.println(str.toString());
	}
}

