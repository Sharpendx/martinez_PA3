import java.util.Scanner;
import java.security.SecureRandom;


public class problem1 {

    public static void main(String args[])
    {
        SecureRandom random = new SecureRandom();
        Scanner scr = new Scanner(System.in);
        int run = 0;
        int a;
        int b;

        do
        {
            a = random.nextInt(9) + 1;
            b = random.nextInt(9) + 1;
            GenerateQuestion(a,b,scr);
        }while(run == 0);

        scr.close();
    }
    public static void GenerateQuestion(int a, int b, Scanner scr)
    {

        int total = a * b;
        int ans = 0;

        println("How much is " + a + " times " + b);

        ans = scr.nextInt();
        if(ans == total)
        {
            println("Very good!");
            //scr.close();
            //return();
        }

        while (ans != total)
        {
            println("No. Please try again.");
            println("How much is " + a + " times " + b);
            ans = scr.nextInt();
        }

        //scr.close();
        //return();
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
