/*
fibonacci converted into tribonacci where F(n)=F(n-1)+F(n-2)+F(n-3)
and first three numbers are 1, 1 and 2
 */
package tribonacci;

/**
 *
 * @author Dell
 */
public class Tribonacci {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
      int n = 4;          // the index n for F(n), starting from n=3 because first two values are 1 and 1
      int fn;             // F(n) to be computed
      int fnMinus1 = 2;   // F(n-1), init to F(3)
      int fnMinus2 = 1;   // F(n-2), init to F(2)
      int fnMinus3 = 1;    // F(n-3), init to F(1)
      int nMax = 20;      // no of counts
      int sum = fnMinus1 + fnMinus2+fnMinus3;  // Need sum to compute average
      double average;
        
      System.out.println("The first " + nMax + " Fibonacci numbers are:");
        System.out.print(fnMinus3+","+fnMinus2+","+fnMinus1+",");
        while (n <= nMax) {  // n starts from 3
        fn = fnMinus1+fnMinus2+fnMinus3; // Compute F(n), print it and add to sum
        System.out.print(fn+ ",");
        sum=fn+sum;
        //Increment the index n and shift the numbers for the next iteration
         ++n;
         fnMinus3=fnMinus2;
         fnMinus2 = fnMinus1; 
         fnMinus1 = fn;
      }
      average=sum/(double)20;
      System.out.println("");
      System.out.println("the average of the tribonacci series is "+average);
      
    }
}
