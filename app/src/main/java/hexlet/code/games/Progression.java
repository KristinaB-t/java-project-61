package hexlet.code.games;
import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class Progression {
    public static int n;
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static Random rand = new Random();
    public static void prog(String args) {
	System.out.println("");
        System.out.println("Welcome to the Brain Games!");
	System.out.print("May I have your name? ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("What number is missing in the progression?");
	System.out.print("Question: ");
        a = (int) (Math.random() * 10);
        b = 2 + (int) (Math.random() * 4);
        c = 3 + (int) (Math.random() * 4);
        print(a, b, c);
        d = a + (c - 1) * b;
        a = d + b * 2;
        c = 3 + (int) (Math.random() * 4);
        System.out.print(".. ");
        print(a, b, c);
        System.out.print("\nYour answer: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int k = 1;
        while (k <= 2) {
            k++;
            if (d + b == n) {
                System.out.println("Correct!");
		System.out.print("Question: ");
                a = (int) (Math.random() * 10);
                b = 2 + (int) (Math.random() * 4);
                c = 3 + (int) (Math.random() * 4);
                print(a, b, c);
                d = a + (c - 1) * b;
                a = d + b * 2;
                c = 3 + (int) (Math.random() * 4);
                System.out.print(".. ");
                print(a, b, c);
                System.out.print("\nYour answer: ");
                Scanner sc = new Scanner(System.in);
                n = sc.nextInt();
            }
	}
        if (d + b != n) {
            var y = d + b;
            System.out.println("'" + n + "' is wrong answer ;(. Correct answer was '" + y + "'.");
	    System.out.println("Let's try again, " + name + "!");
        } else {
            System.out.println("Correct!");
	    System.out.println("Congratulations, " + name + "!");
        }
    }
    public static void print(int a, int b, int c) {
        var cr = a;
        for (int i = 1; i <= c; i++) {
            System.out.print(cr + " ");
            cr += b;
        }
    }
}
