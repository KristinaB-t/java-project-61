package hexlet.code;
import java.util.Scanner;

public class Cli {

    public static void nam(String args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("May I have your name? ");
	String name = scan.nextLine();
	System.out.println("Hello, " + name + "!");
    }
}
