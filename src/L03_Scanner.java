import java.util.Scanner;

public class L03_Scanner {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = input.nextLine(); // Read a line of text from the user

        // Ask the user for their age
        System.out.print("Enter your age: ");
        int age = input.nextInt(); // Read an integer value

        // Display the collected data
        System.out.println("Hello " + name + "! You are " + age + " years old.");

        // Ask for an integer
        System.out.print("Enter an integer number: ");
        int number = input.nextInt(); // Reads an integer

        // Ask for a decimal number
        System.out.print("Enter a decimal number: ");
        double decimal = input.nextDouble(); // Reads a double

        // Ask for a word
        System.out.print("Enter a word: ");
        String word = input.next(); // Reads a single word (not full sentence)

        // Display results
        System.out.println("Integer: " + number);
        System.out.println("Decimal: " + decimal);
        System.out.println("Word: " + word);

        input.close();

    }
}
