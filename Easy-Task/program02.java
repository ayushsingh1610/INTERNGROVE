// Write a program to check if a number is prime or not.
import java.util.*;
public class program02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        if(isPrime(num)){
            System.out.format("%d is Prime Number.",num);
        }
        else{
            System.out.format("%d is NOT a Prime Number.",num);
        }
    }
    public static boolean isPrime(int num)
    {
        for(int i=2;i<num;i++)
        {
            if(num%i ==0)
            {
                return false;
            }
        }
        return true;
    }
}
