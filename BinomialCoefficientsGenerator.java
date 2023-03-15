/*
Binomial coefficient - shortcut using factorials
*/
public class BinomialCoefficientsGenerator
{
   public static int factorial (int n)
   {
      int result = 0;
      if (n >= 0)
      {
         result = 1;
         for (int k = 1; k <= n; k++)
            result = result * k;
      }

      return result;
   }

   // n = highest Binomial power, e.g. 5.
   // k = which term we need a coefficient for.  k = 0 = 1st term.
   public static int getBinomialCoefficient (int n, int k)
   {
      int result = 0;
      if ((n >= 1) && (k >= 0) )
      {
         result = factorial (n) / (factorial (k) * factorial (n-k) );
      }

      return result;
   }


   public static void main (String[] args)
   {
      System.out.println ("5! = " + factorial(5) ); // 120


      System.out.println ();
      System.out.print ("Binomial Coefficients for: (x+1)^5: ");
      for (int k = 0; k <= 5; k++)
         System.out.print (getBinomialCoefficient (5, k) + ", ");

      System.out.println ();


      System.out.println ();
      for (int p = 1; p <= 8; p++)
      {
         System.out.print ("Binomial Coefficients for: (x+1)^" + p + ": ");
         for (int k = 0; k <= p; k++)
            System.out.print (getBinomialCoefficient (p, k) + ", ");

         System.out.println ();
      }
   }

}