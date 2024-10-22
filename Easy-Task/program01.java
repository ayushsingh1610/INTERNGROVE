// Develop a program that finds the largest number among three numbers.
import java.util.*;
public class program01
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        System.out.print("Enter the 1st number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number = ");
        int num2 = sc.nextInt();

        System.out.print("Enter the 3rd number = ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3)
        {
            max = num1;
        }
        else if(num2 > num1 && num2 > num3)
        {
            max = num2;
        }
        else{
            max = num3;
        }

        System.out.println("The largest among three numbers is: " + max);

        
    }
}