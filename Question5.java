import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
       Scanner in = new Scanner(System.in);
 
       ArrayList<Integer> data = new ArrayList<>();


       System.out.print("Enter the number of digits you will enter: ");
       int digits = in.nextInt();
       for( int i=0; i<digits; i++)
       {
         System.out.print("Enter a digit: ");
         int number = in.nextInt();
         data.add(number);
       }
       int maxcount=0;
       int maxvalue=0;
       for (int j = 0; j < data.size(); j++) {
         int count = 0;
         for (int k = 0; k < data.size(); k++) {
            if (data.get(k) == data.get(j)) count++;
            }
            if (count > maxcount) {
              maxcount = count;
              maxvalue = data.get(j);
               }
        }
        System.out.println("Mode is "+ maxvalue);

  }
}
