public class L14_ForLoop {
    public static void main(String[] args) {

        // --------------------------------
        // 1️ BASIC FOR LOOP
        // --------------------------------
        // The for loop repeats a block of code a specific number of times.
        // Syntax: for(initialization; condition; update) { ... }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
        // Output:
        // Count: 1
        // Count: 2
        // Count: 3
        // Count: 4
        // Count: 5


        // --------------------------------
        // 2️ LOOP THAT PRINTS EVEN NUMBERS
        // --------------------------------
        // We can use a step value by modifying the update section.
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even number: " + i);
        }
        // Output: 2, 4, 6, 8, 10


        // --------------------------------
        // 3️ LOOP THAT COUNTS DOWN
        // --------------------------------
        // You can also decrement in a for loop.
        for (int i = 5; i >= 1; i--) {
            System.out.println("Countdown: " + i);
        }
        // Output: 5, 4, 3, 2, 1


        // --------------------------------
        // 4️ SUM OF NUMBERS USING FOR LOOP
        // --------------------------------
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i; // same as sum = sum + i
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        // Output: 55


        // --------------------------------
        // 5️ FOR LOOP WITH STRING
        // --------------------------------
        String text = "JAVA";
        for (int i = 0; i < text.length(); i++) {
            System.out.println("Character at index " + i + ": " + text.charAt(i));
        }
        // Output:
        // Character at index 0: J
        // Character at index 1: A
        // Character at index 2: V
        // Character at index 3: A


        // --------------------------------
        // 6️ NESTED FOR LOOP
        // --------------------------------
        // Loop inside another loop (used for tables, patterns, etc.)
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println(); // move to next line
        }
        // Output:
        // (1,1) (1,2) (1,3)
        // (2,1) (2,2) (2,3)
        // (3,1) (3,2) (3,3)

    }
}
