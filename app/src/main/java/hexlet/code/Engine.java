package hexlet.code;
import java.util.Scanner;
import hexlet.code.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Engine {

    public static void main(String args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
	System.out.println("1 - Greet");
	System.out.println("2 - Even");
	System.out.println("3 - Calc");
	System.out.println("4 - GCD");
	System.out.println("5 - Progression");
	System.out.println("6 - Prime");
	System.out.println("0 - Exit");
	System.out.print("Your choice: ");
        String name = scan.nextLine();
        if (name.equals("1")) {
            Engine.vin(name);
        } else if (name.equals("2")) {
            Even.even(name);
        } else if (name.equals("3")) {
            Calc.calc(name);
        } else if (name.equals("4")) {
            GCD.calc(name);
        } else if (name.equals("5")) {
            Progression.prog(name);
        } else if (name.equals("6")) {
            Prime.prime(name);
        }else {
            Engine.n(name);
        }
    }
    public static void vin(String args) {
        String v = "Welcome to the Brain Games!";
	System.out.println("");
        System.out.println(v);
        Cli.nam(v);
    }
    public static void n(String args) {
        System.out.print("");
    }
}
