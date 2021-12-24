public class Armstrongnumbers {

	 public static void main (String args[])
     {
           
            for (int i = 100 ; i <= 1000 ; i++)
             {
                        int n = i;
                        int r = 0;
                        int s = 0;

                        while (n > 0)
                         {
                                     r = n % 10;
                                     s = s + (r * r * r);
                                     n = n / 10;
                         }
                         if (i == s)
                          {
                          System.out.println (i + "is Armstrong number");
                           }
              }
    } 
}
