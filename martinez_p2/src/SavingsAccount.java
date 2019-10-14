public class SavingsAccount
{
    private static double annualInterestRate;

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    private double savingsBalance;

    public SavingsAccount(double userBal)
    {
        savingsBalance = userBal;
    }
    public static double calculateMonthlyInterest(SavingsAccount userAcc)
    {
        return (userAcc.savingsBalance * (userAcc.annualInterestRate / 12)) + userAcc.savingsBalance;
    }

    public static void modifyInterestRate(double newIR)
    {
        annualInterestRate = newIR;
    }

}
