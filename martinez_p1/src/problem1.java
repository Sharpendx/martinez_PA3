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
        int response;

        do
        {
            response = random.nextInt(4) + 1;
            a = random.nextInt(9) + 1;
            b = random.nextInt(9) + 1;
            GenerateQuestion(a,b,scr,response);
        }while(run == 0);

        scr.close();
    }
    public static void GenerateQuestion(int a, int b, Scanner scr, int response)
    {

        int total = a * b;
        int ans = 0;

        println("How much is " + a + " times " + b);

        ans = scr.nextInt();
        if(ans == total)
        {
            switch(response)
            {
                case 1 :
                    println("Very good!");
                    break;

                case 2 :
                    println("Excellent!");
                    break;

                case 3 :
                    println("Nice work!");
                    break;

                case 4 :
                    println("Keep up the good work!");
                    break;

                default :
                    println("ERROR WRONG NUMBER");
            }

            //scr.close();
            //return();
        }

        while (ans != total)
        {
            switch(response)
            {
                case 1 :
                    println("No. Please try again.");
                    break;

                case 2 :
                    println("Wrong. Try once more.");
                    break;

                case 3 :
                    println("Don’t give up!");
                    break;

                case 4 :
                    println("No. Keep trying.");
                    break;

                default :
                    println("ERROR WRONG NUMBER");
            }

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