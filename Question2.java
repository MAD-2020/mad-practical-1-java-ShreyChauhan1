import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter your weight in kg: ");
    double weight = in.nextDouble();
    System.out.print("Please enter your height in m: ");
    double height = in.nextDouble();
    double bmi= height * weight;
    System.out.printIn("Your BMI is " + bmi);
    
  }
}
