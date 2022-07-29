import java.util.Random;
import java.util.Scanner;

// 0-ROCK
// 1-PAPER
// 2-SCISSOR


public class Rock_Paper_Scissor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : 0-ROCK           1-PAPER             2-SCISSOR ");
        System.out.print("Enter Your Choice : ");
        int UserChoice = sc.nextInt();
        Random random = new Random();
        int ComputerChoice = random.nextInt(3);
        if (ComputerChoice == UserChoice)
        {
            System.out.println("Draw !!! You get another chance to Win .");
        }
        else if ((UserChoice == 0 && ComputerChoice == 2) || (UserChoice == 1 && ComputerChoice == 0) || (UserChoice == 2 && ComputerChoice == 1))
        {
            System.out.println("Congratulations !!! YOU-WON");
        }
        else
        {
            System.out.println("OOPS !!! YOU-LOSE ");
            System.out.println("<<< BETTER LUCK NEXT TIME >>>");
        }
        if (ComputerChoice == 0) {
            System.out.println("ComputerChoice : ROCK");
        } else if (ComputerChoice == 1) {
            System.out.println("ComputerChoice : PAPER");
        } else {
            System.out.println("ComputerChoice : SCISSOR");
        }
    }
}