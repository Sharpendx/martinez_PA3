import java.util.Scanner;

public class Application
{
    public static void main(String args[])
    {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        double temp;
        double temp2;
        double temp3;
        saver1.modifyInterestRate(0.04);
        saver2.modifyInterestRate(0.04);

        temp = saver1.calculateMonthlyInterest(saver1) - saver1.getSavingsBalance();
        temp2 = saver2.calculateMonthlyInterest(saver2) - saver2.getSavingsBalance();

        System.out.printf("The first customer's monthly interest will be %.2f at %.1f%%%n",temp, saver1.getAnnualInterestRate() * 100);
        System.out.printf("The first customer's new balance will be %.2f for the end of this month%n", saver1.calculateMonthlyInterest(saver1));
        println("");
        System.out.printf("The second customer's monthly interest will be %.2f at %.1f%%%n",temp2, saver2.getAnnualInterestRate() * 100);
        System.out.printf("The second customer's new balance will be will be %.2f for the end of this month%n",saver2.calculateMonthlyInterest(saver2));
        println("");
        saver1.modifyInterestRate(0.05);
        saver2.modifyInterestRate(0.05);

        temp = saver1.calculateMonthlyInterest(saver1) - saver1.getSavingsBalance();
        temp2 = saver2.calculateMonthlyInterest(saver2) - saver2.getSavingsBalance();

        System.out.printf("The first customer's monthly interest will be %.2f at %.1f%%%n",temp, saver1.getAnnualInterestRate() * 100);
        System.out.printf("The first customer's new balance will be %.2f for the end of this month%n", saver1.calculateMonthlyInterest(saver1));
        println("");
        System.out.printf("The second customer's monthly interest will be %.2f at %.1f%%%n",temp2, saver2.getAnnualInterestRate() * 100);
        System.out.printf("The second customer's new balance will be will be %.2f for the end of this month%n",saver2.calculateMonthlyInterest(saver2));
        println("");
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
