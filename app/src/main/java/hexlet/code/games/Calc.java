package hexlet.code.games;
import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class Calc {
    public static int n;
    public static int c;
    public static int operator;
    public static String operatorSwitch;
    public static int d = (int) (Math.random() * 10);
    public static int e = (int) (Math.random() * 10);
    public static void calc(String args) {
	System.out.println("");
        System.out.println("Welcome to the Brain Games!");
	System.out.print("May I have your name? ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Hello, " + name + "!");
        Random rand = new Random();
        operator = rand.nextInt(3);
        switch (operator) {
        case 0:
            operatorSwitch = "+";
            c = d + e;
            break;
        case 1:
            operatorSwitch = "-";
            c = d - e;
            break;
        case 2:
            operatorSwitch = "*";
            c = d * e;
            break;
        default:
	    operatorSwitch = "";
        }
        System.out.println("What is the result of the expression?");
	System.out.println("Question: " + d + " " + operatorSwitch + " " + e);
	System.out.print("Your answer: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int k = 1;
        while (k <= 2) {
            k++;
            if (n == c) {
                d = (int) (Math.random() * 10);
                e = (int) (Math.random() * 10);
                Random r = new Random();
                operator = r.nextInt(3);
                switch (operator) {
                case 0:
                    operatorSwitch = "+";
                    c = d + e;
                    break;
                case 1:
                    operatorSwitch = "-";
                    c = d - e;
                    break;
                case 2:
                    operatorSwitch = "*";
                    c = d * e;
                    break;
                default:
		    operatorSwitch = "";
                }
                System.out.println("Correct!");
		System.out.println("Question: " + d + " " + operatorSwitch + " " + e);
		System.out.print("Your answer: ");
                Scanner scann = new Scanner(System.in);
                n = scann.nextInt();
            }
        }
        if (n != c) {
            System.out.println("'" + n + "' is wrong answer ;(. Correct answer was '" + c + "'.");
	    System.out.println("Let's try again, " + name +"!");
        } else {
	    System.out.println("Correct!");
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
