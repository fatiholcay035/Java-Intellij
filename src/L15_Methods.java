public class L15_Methods {
    // --------------------------------
    // 1️ BASIC METHOD STRUCTURE
    // --------------------------------
    // Syntax:
    // accessModifier returnType methodName(parameters) {
    //     // code block
    //     return value; // if returnType is not void
    // }

    // Example: A simple method that prints a message
    public static void sayHello() {
        System.out.println("Hello from method!");
    }


    // --------------------------------
    // 2️ METHOD WITH PARAMETERS
    // --------------------------------
    // This method takes one parameter (a name) and prints a greeting
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }


    // --------------------------------
    // 3️ METHOD THAT RETURNS A VALUE
    // --------------------------------
    // This method adds two numbers and returns the result
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum; // returning the calculated value
    }


    // --------------------------------
    // 4️ METHOD THAT RETURNS A STRING
    // --------------------------------
    // This method checks if a number is even or odd
    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }


    // --------------------------------
    // 5️ MAIN METHOD — program starts here
    // --------------------------------
    public static void main(String[] args) {

        // Calling a simple method
        sayHello(); // Output: Hello from method!

        // Calling method with parameter
        greetUser("Fatih"); // Output: Hello, Fatih!

        // Calling method that returns an int
        int result = addNumbers(5, 7);
        System.out.println("The sum is: " + result); // Output: The sum is: 12

        // Calling method that returns a String
        String type = checkEvenOdd(9);
        System.out.println("The number is: " + type); // Output: The number is: Odd
    }
}
