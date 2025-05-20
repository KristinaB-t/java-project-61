package hexlet.code.games;
import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class Prime {
    public static String n;
    public static int randomNumber = (int) (Math.random() * 10);
    public static void prime(String args) {
	System.out.println("");
        System.out.println("Welcome to the Brain Games!");
	System.out.print("May I have your name? ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Hello, " + name + "!");
        Random rand = new Random();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
	System.out.println("Question: " + randomNumber);
	System.out.print("Your answer: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextLine();
        int k = 1;
        while (k <= 2) {
            k++;
            if (randomNumber == 2 & n.equals("yes")) {
                Scanner scnn = new Scanner(System.in);
                System.out.println("Correct!");
		randomNumber = (int) (Math.random() * 10);
		System.out.println("Question: " + randomNumber);
                System.out.print("Your answer: ");
                n = scnn.nextLine();
            } else if (pr(randomNumber) & n.equals("yes")) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Correct!");
                randomNumber = (int) (Math.random() * 10);
                System.out.println("Question: " + randomNumber);
                System.out.print("Your answer: ");
                n = sc.nextLine();
            } else if (!pr(randomNumber) & n.equals("no")) {
                Scanner sca = new Scanner(System.in);
                System.out.println("Correct!");
                randomNumber = (int) (Math.random() * 10);
                System.out.println("Question: " + randomNumber);
                System.out.print("Your answer: ");
                n = sca.nextLine();
            }
        }
        if (randomNumber == 2 & !n.equals("yes")) {
            System.out.println("'" + n + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
	    System.out.println("Let's try again, " + name + "!");
        } else if (pr(randomNumber) & !n.equals("yes")) {
            System.out.println("'" + n + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
	    System.out.println("Let's try again, " + name + "!");
        } else if (!pr(randomNumber) & !n.equals("no")) {
            System.out.println("'" + n + "'" + " is wrong answer ;(. Correct answer was 'no'.");
	    System.out.println("Let's try again, " + name + "!");
        } else {
            System.out.println("Correct!");
	    System.out.println("Congratulations, " + name + "!");
	}
    }
    public static boolean pr(Integer number) {
        if (randomNumber < 2) {
            return false;
        }
        for (int i = 2; i < randomNumber; i++) {
            if (randomNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
