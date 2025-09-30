import java.util.Scanner;

public class L18_DoWhileLoop {
    public static void main(String[] args) {



        // The do-while loop executes the code block at least ONCE,
        // then checks the condition.


        // Syntax:
        // do {
        //     // code block
        // } while (condition);

        int count = 1;

        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 5);

        // Output:
        // Count: 1
        // Count: 2
        // Count: 3
        // Count: 4
        // Count: 5



        // 2️ COMPARISON WITH WHILE LOOP

        // Even if the condition is false,
        // the do-while loop runs at least once.

        int number = 10;

        do {
            System.out.println("This will run once even though number < 5 is false");
        } while (number < 5);

        // Output:
        // This will run once even though number < 5 is false



        // 3 EXAMPLE: USER INPUT VALIDATION

        // Ask user to enter a positive number
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a positive number: ");
            num = input.nextInt();

            if (num <= 0) {
                System.out.println("That's not positive! Try again.");
            }

        } while (num <= 0);

        System.out.println("You entered a valid number: " + num);


        // 4️ SUMMARY

        // do-while runs at least once
        // condition is checked after executing the loop
        // useful for input validation or menu-driven programs

        /*
        while → checks condition before executing

        do-while → checks condition after executing

        So, do-while loop always runs at least once

        Common use cases:
           User input
           Menus
           Repeated tasks where you need at least one run
         */


    }
}
