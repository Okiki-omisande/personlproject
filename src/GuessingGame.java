import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int RN = (int) (Math.random() * 10 + 1);
        int Counter = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter player name:");
        String name = input.next();
        System.out.println();
        System.out.println("Welcome " + name);
        System.out.println("here is how to play the game");
        System.out.println("-guess a lucky number between 1-10");
        System.out.println("-get a clue if your guess is greater or lesser");
        System.out.println("-get $10 reward if your guess is correct at first try");
        System.out.println("-Let's PLAY!!!");

        System.out.println("Enter your guess:");
        int Guess = input.nextInt();

        while (Guess != RN) {
            ++Counter;

            if (Guess > RN)
                System.out.printf("<clue> %d is greater than the lucky number%n", Guess);
            else
                System.out.printf("<clue> %d is lesser than the lucky number%n", Guess);
            System.out.println("Enter your Guess:");
            Guess = input.nextInt();

        }
        System.out.println();
        if (Counter == 0) {
            System.out.println("* * * * *");
            System.out.println("rank: MAESTRO!!");
            System.out.println("you've been rewarded with $10");
        } else if (Counter == 1) {
            System.out.println("* * * ");
            System.out.println("rank: INTERMEDIATE");
        } else if (Counter == 2) {
            System.out.println("*");
            System.out.println("Amateur!!");
        } else {
            System.out.println("no star");
            System.out.println("rank: NEWBIE");
            System.out.println("you can do better");
        }
    }
}