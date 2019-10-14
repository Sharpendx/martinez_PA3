import java.util.Scanner;

public class Application
{
    public static void main(String args[])
    {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        double temp;
        double temp2;
        saver1.modifyInterestRate(0.04);
        saver2.modifyInterestRate(0.04);

        println("The first customer's new balance will be " + saver1.calculateMonthlyInterest(saver1) + " at " + saver1.getAnnualInterestRate() + " for the end of this month");
        println("The second customer's new balance will be " + saver2.calculateMonthlyInterest(saver2) + " at " + saver2.getAnnualInterestRate() + " for the end of this month");

        saver1.modifyInterestRate(0.05);
        saver2.modifyInterestRate(0.05);

        println("The first customer's new balance will be " + saver1.calculateMonthlyInterest(saver1) + " at " + saver1.getAnnualInterestRate() + " for the end of this month");
        println("The second customer's new balance will be " + saver2.calculateMonthlyInterest(saver2) + " at " + saver2.getAnnualInterestRate() + " for the end of this month");
    }

    public static void print(String s)
    {
        System.out.print(s);
    }
    public static void println(String s)
    {
        System.out.println(s);
    }
}
