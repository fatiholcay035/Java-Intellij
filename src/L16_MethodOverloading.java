public class L16_MethodOverloading {

        // --------------------------------
        // 1️ METHOD OVERLOADING BASICS
        // --------------------------------
        // Method overloading allows multiple methods with the same name
        // but different parameter lists (type, number, or order of parameters)

        // Example 1: Add two integers
        public static int add(int a, int b) {
            return a + b;
        }

        // Example 2: Add three integers
        public static int add(int a, int b, int c) {
            return a + b + c;
        }

        // Example 3: Add two double values
        public static double add(double a, double b) {
            return a + b;
        }

        // Example 4: Greet user with first and last name
        public static void greet(String firstName, String lastName) {
            System.out.println("Hello, " + firstName + " " + lastName + "!");
        }

        // Example 5: Greet user with only first name
        public static void greet(String firstName) {
            System.out.println("Hello, " + firstName + "!");
        }

        // --------------------------------
        // 2️ MAIN METHOD
        // --------------------------------
        public static void main(String[] args) {

            // Calling add methods
            int sum1 = add(5, 10);            // calls add(int, int)
            int sum2 = add(3, 4, 5);          // calls add(int, int, int)
            double sum3 = add(2.5, 4.3);      // calls add(double, double)

            System.out.println("Sum1: " + sum1);  // Output: 15
            System.out.println("Sum2: " + sum2);  // Output: 12
            System.out.println("Sum3: " + sum3);  // Output: 6.8

            // Calling greet methods
            greet("Fatih");                    // Output: Hello, Fatih!
            greet("Fatih", "Olcay");           // Output: Hello, Fatih Olcay!

            /*
            *In Java, if we want to create methods with the same name within the same class,
            this is called overloading.
            *These methods must have different signatures.

            * Explanation:

            Method overloading = same method name, different parameter list

            The compiler decides which method to call based on:

            Number of parameters

            Type of parameters

            Order of parameters

            Return type does not count for overloading alone

            * Key Points:

            Overloading improves code readability.

            Useful when performing similar operations with different data types or number of inputs.

            Overloaded methods can be void or return a value.



             */

        }
    }



