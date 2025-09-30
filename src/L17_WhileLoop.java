import java.util.Scanner;

public class L17_WhileLoop {
    public static void main(String[] args) {

        // --------------------------------
        // 1️ WHAT IS A WHILE LOOP?
        // --------------------------------
        // A while loop repeats a block of code
        // as long as the given condition is TRUE.
        //
        // Syntax:
        // while (condition) {
        //     // code to be executed
        // }

        int count = 1;

        while (count <= 5) {
            System.out.println("Count: " + count);
            count++; // increase the counter
        }
        // Output:
        // Count: 1
        // Count: 2
        // Count: 3
        // Count: 4
        // Count: 5


        // --------------------------------
        // 2️ EXAMPLE: SUM OF NUMBERS
        // --------------------------------
        int number = 1;
        int total = 0;

        while (number <= 10) {
            total += number; // same as total = total + number
            number++;
        }
        System.out.println("Sum from 1 to 10: " + total);
        // Output: 55


        // --------------------------------
        // 3️ EXAMPLE: PRINT EVEN NUMBERS
        // --------------------------------
        int i = 2;
        while (i <= 10) {
            System.out.println("Even number: " + i);
            i += 2; // step by 2
        }
        // Output: 2, 4, 6, 8, 10


        // --------------------------------
        // 4️ EXAMPLE: COUNTDOWN
        // --------------------------------
        int countdown = 5;
        while (countdown > 0) {
            System.out.println("Countdown: " + countdown);
            countdown--;
        }
        System.out.println("Lift off!");
        // Output:
        // Countdown: 5
        // Countdown: 4
        // Countdown: 3
        // Countdown: 2
        // Countdown: 1
        // Lift off!


        // --------------------------------
        // 5️ INFINITE LOOP !!!
        // --------------------------------
        // ️ If the condition never becomes false,
        // the loop will run forever.
        //
        // Example (DON'T RUN THIS):
        // while (true) {
        //     System.out.println("This will never stop!");
        // }

        // --------------------------------
        // SUMMARY
        // --------------------------------
        //  while loop checks condition before each iteration
        //  if the condition is false at the beginning, the loop won't run
        //  used when the number of iterations is not known in advance

        //EXAMPLE
        // Create a Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        int number1;       // user input
        int sum = 0;      // total sum

        System.out.println("Enter positive numbers to add (enter 0 to stop):");

        // while loop runs as long as number1 is not zero
        while (true) {
            System.out.print("Enter a number: ");
            number1 = input.nextInt();

            // if user enters 0, stop the loop
            if (number1 == 0) {
                break;
            }

            // add only positive numbers
            if (number1 > 0) {
                sum += number;
            } else {
                System.out.println("Please enter a positive number!");
            }
        }

        System.out.println("Total sum of positive numbers: " + sum);
        input.close();

    }
}
