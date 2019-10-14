import java.util.Scanner;
import java.security.SecureRandom;


public class problem1 {

    public static void main(String args[])
    {
        SecureRandom random = new SecureRandom();
        Scanner scr = new Scanner(System.in);
        int lvl = 0;
        int a;
        int b;
        int response;
        int numAnsRight = 0;
        double numAns = 0;
        double percentNeeded = 0.75;
        double percentActual = 0.0;
        boolean ansCorrect;

        println("Welcome to our Math learning program!");
        println("Please select a difficulty level enter either 1, 2, or 3");

        lvl = scr.nextInt();

        while(lvl == 1)
        {
            response = random.nextInt(4) + 1;
            a = random.nextInt(9) + 1;
            b = random.nextInt(9) + 1;
            ansCorrect = GenerateQuestionMult(a,b,scr,response);
            if(ansCorrect == true)
            {
                numAnsRight++;
                numAns++;
            }

            if(ansCorrect != true)
            {
                numAns++;
            }

            if(numAns == 10)
            {
                percentActual = numAnsRight / numAns;
                println("" + percentActual);
                println("" + percentNeeded);
                if(percentActual >= percentNeeded)
                {
                    println("Congratulations, you are ready to go to the next level!");
                    lvl = 0;
                }
                else
                {
                    println("Please ask your teacher for extra help.");
                    lvl = 0;
                }

            }
            println("You've gotten " + numAnsRight + "so far");
        }
        while(lvl == 2)
        {
            response = random.nextInt(4) + 1;
            a = random.nextInt(99) + 1;
            b = random.nextInt(99) + 1;
            ansCorrect = GenerateQuestionMult(a,b,scr,response);
            if(ansCorrect == true)
            {
                numAnsRight++;
                numAns++;
            }

            if(ansCorrect != true)
            {
                numAns++;
            }
            //println("You have answered " + numAns + " times.");
            if(numAns == 10)
            {
                percentActual = numAnsRight / numAns;
                if(percentActual >= percentNeeded)
                {
                    println("Congratulations, you are ready to go to the next level!");
                    lvl = 0;
                }
                else
                {
                    println("Please ask your teacher for extra help.");
                    lvl = 0;
                }

            }
        }
        scr.close();
    }
    public static boolean GenerateQuestionMult(int a, int b, Scanner scr, int response)
    {

        int total = a * b;
        int ans = 0;
        int numAns = 0;
        println("How much is " + a + " times " + b);

        ans = scr.nextInt();
        if(ans == total)
        {
            numAns++;
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
                    break;
            }
            return(true);
        }

        if (ans != total)
        {
            numAns++;
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
                    break;
            }

        }
        return(false);
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