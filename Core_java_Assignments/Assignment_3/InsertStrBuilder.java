
public class InsertStrBuilder {
	 public static void main(String[] args) {
		  
	      StringBuilder str = new StringBuilder("it is used to at the specified index position");
	      System.out.println("string = " + str);

	      str.insert(8, "insert text");

	      System.out.print("After insertion = ");
	      System.out.println(str.toString());
	   }      
}
