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
     
    System.out.print("Please enter your weight in kg: ");
    Scanner W = new Scanner(System.in);
    double weight = W.nextDouble();

    System.out.print("Please enter your height in m: ");
    Scanner H = new Scanner(System.in);
    double height = H.nextDouble();

    double bmi= (weight)/(height*height);
    
    System.out.println("Your BMI is " + bmi);
    
  }
}
