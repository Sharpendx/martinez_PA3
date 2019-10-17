import java.security.SecureRandom;
import java.util.Scanner;
import java.math.RoundingMode;
public class problem1 {

    public static void main(String args[])
    {
        SecureRandom random = new SecureRandom();
        Scanner scr = new Scanner(System.in);
        int lvl = 0;
        int typeOfProb = 0;
        int a;
        int b;
        int response;
        int numAnsRight = 0;
        double numAns = 0;
        double percentNeeded = 0.75;
        double percentActual = 0.0;
        boolean ansCorrect = false;
        boolean randomQuest = false;

        println("Welcome to our Math learning program!");
        println("Please select a difficulty level enter either 1, 2, 3, or 4");

        lvl = scr.nextInt();

        println("Please select a type of math to study:");
        println("   Addition---------------------------1");
        println("   Subtraction------------------------2");
        println("   Multiplication---------------------3");
        println("   Division---------------------------4");
        println("   Random-----------------------------5");

        typeOfProb = scr.nextInt();

        while(lvl == 1)
        {
            if(typeOfProb == 5)
            {
                randomQuest = true;
            }

            if(randomQuest == true)
            {
                typeOfProb = random.nextInt(4) + 1;
            }

            response = random.nextInt(4) + 1;
            a = random.nextInt(9) + 1;
            b = random.nextInt(9) + 1;
            switch(typeOfProb)
            {
                case 1 :
                    ansCorrect = GenerateQuestionAdd(a,b,scr,response);
                    break;

                case 2 :
                    ansCorrect = GenerateQuestionSub(a,b,scr,response);
                    break;

                case 3 :
                    ansCorrect = GenerateQuestionMult(a,b,scr,response);
                    break;

                case 4 :
                    ansCorrect = GenerateQuestionDiv(a,b,scr,response);
                    break;

                default :
                    println("ERROR WRONG NUMBER");
                    break;
            }

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
        while(lvl == 2)
        {
            if(typeOfProb == 5)
            {
                randomQuest = true;
            }

            if(randomQuest == true)
            {
                typeOfProb = random.nextInt(4) + 1;
            }

            response = random.nextInt(4) + 1;
            a = random.nextInt(99) + 1;
            b = random.nextInt(99) + 1;
            switch(typeOfProb)
            {
                case 1 :
                    ansCorrect = GenerateQuestionAdd(a,b,scr,response);
                    break;

                case 2 :
                    ansCorrect = GenerateQuestionSub(a,b,scr,response);
                    break;

                case 3 :
                    ansCorrect = GenerateQuestionMult(a,b,scr,response);
                    break;

                case 4 :
                    ansCorrect = GenerateQuestionDiv(a,b,scr,response);
                    break;

                default :
                    println("ERROR WRONG NUMBER");
                    break;
            }

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
        while(lvl == 3)
        {
            if(typeOfProb == 5)
            {
                randomQuest = true;
            }

            if(randomQuest == true)
            {
                typeOfProb = random.nextInt(4) + 1;
            }

            response = random.nextInt(4) + 1;
            a = random.nextInt(999) + 1;
            b = random.nextInt(999) + 1;
            switch(typeOfProb)
            {
                case 1 :
                    ansCorrect = GenerateQuestionAdd(a,b,scr,response);
                    break;

                case 2 :
                    ansCorrect = GenerateQuestionSub(a,b,scr,response);
                    break;

                case 3 :
                    ansCorrect = GenerateQuestionMult(a,b,scr,response);
                    break;

                case 4 :
                    ansCorrect = GenerateQuestionDiv(a,b,scr,response);
                    break;

                default :
                    println("ERROR WRONG NUMBER");
                    break;
            }

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
        while(lvl == 4)
        {
            if(typeOfProb == 5)
            {
                randomQuest = true;
            }

            if(randomQuest == true)
            {
                typeOfProb = random.nextInt(4) + 1;
            }

            response = random.nextInt(4) + 1;
            a = random.nextInt(9999) + 1;
            b = random.nextInt(9999) + 1;
            switch(typeOfProb)
            {
                case 1 :
                    ansCorrect = GenerateQuestionAdd(a,b,scr,response);
                    break;

                case 2 :
                    ansCorrect = GenerateQuestionSub(a,b,scr,response);
                    break;

                case 3 :
                    ansCorrect = GenerateQuestionMult(a,b,scr,response);
                    break;

                case 4 :
                    ansCorrect = GenerateQuestionDiv(a,b,scr,response);
                    break;

                default :
                    println("ERROR WRONG NUMBER");
                    break;
            }

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
    public static boolean GenerateQuestionAdd(int a, int b, Scanner scr, int response)
    {

        int total = a + b;
        int ans = 0;
        int numAns = 0;
        println("How much is " + a + " plus " + b);

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
    public static boolean GenerateQuestionSub(int a, int b, Scanner scr, int response)
    {

        int total = a - b;
        int ans = 0;
        int numAns = 0;
        println("How much is " + a + " minus " + b);

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
    public static boolean GenerateQuestionDiv(int a, int b, Scanner scr, int response)
    {
        double aD = a;
        double bD = b;
        double total = a / b;
        double ans = 0;
        int numAns = 0;
        println("How much is " + a + " divided by " + b);
        println("Please round to two decimal places.");
        ans = (Math.round(scr.nextDouble() * 100.0))/100;
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