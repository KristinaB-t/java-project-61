package hexlet.code.games;
import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class GCD {
    public static int n;
    public static int v;
    public static int gc;
    public static int d = 1 + (int) (Math.random() * 20);
    public static int e = 1 + (int) (Math.random() * 20);
    public static void calc(String args) {
	System.out.println("");
        System.out.println("Welcome to the Brain Games!");
	System.out.print("May I have your name? ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Hello, " + name + "!");
        Random rand = new Random();
        System.out.println("Find the greatest common divisor of given numbers.");
	System.out.println("Question: " + d + " " + e);
	System.out.print("Your answer: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        v = gcd(d, e);
        int k = 1;
        while (k <= 2) {
            k++;
            if (n == v) {
                d = 1 + (int) (Math.random() * 20);
                e = 1 + (int) (Math.random() * 20);
                System.out.println("Correct!");
		System.out.println("Question: " + d + " " + e);
		System.out.print("Your answer: ");
		v = gcd(d, e);
                Scanner scann = new Scanner(System.in);
                n = scann.nextInt();
            }
        }
        if (n != v) {
            System.out.println("'" + n + "' is wrong answer ;(. Correct answer was '" + v + "'.");
	    System.out.println("Let's try again, " + name +"!");
        } else {
	    System.out.println("Correct!");
            System.out.println("Congratulations, " + name + "!");
        }
    }
    public static int gcd(int x, int y) {
        gc = 1;
	for (int i = 1; i <= x & i <= y; i++) {
	    if ( x % i == 0 & y % i == 0) {
	        gc = i;
	    }
	}
	return gc;
    }
}
