import java.util.Scanner;

public class SimpleInterest 
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the annual interest rate (in %): ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time in years: ");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The calculated simple interest is: " + simpleInterest);

        sc.close();
    }
}
