/*
Binomial coefficient - shortcut using factorials

*** Sample Output:

5! = 120

Binomial Coefficients for: (x+1)^5: 1, 5, 10, 10, 5, 1,

Binomial Coefficients for: (x+1)^1: 1, 1,
Binomial Coefficients for: (x+1)^2: 1, 2, 1,
Binomial Coefficients for: (x+1)^3: 1, 3, 3, 1,
Binomial Coefficients for: (x+1)^4: 1, 4, 6, 4, 1,
Binomial Coefficients for: (x+1)^5: 1, 5, 10, 10, 5, 1,
Binomial Coefficients for: (x+1)^6: 1, 6, 15, 20, 15, 6, 1,
Binomial Coefficients for: (x+1)^7: 1, 7, 21, 35, 35, 21, 7, 1,
Binomial Coefficients for: (x+1)^8: 1, 8, 28, 56, 70, 56, 28, 8, 1,

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