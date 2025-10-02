public class L11_TernaryOperator {
    public static void main(String[] args) {

        // -----------------------------
        // 1️ BASIC TERNARY EXAMPLE
        // -----------------------------
        int number = 10;

        // Check if number is positive or negative

        // Syntax: condition ? expressionIfTrue : expressionIfFalse

        String result = (number > 0) ? "Positive" : "Negative";
        System.out.println("The number is: " + result);
        // Output: The number is: Positive


        // -----------------------------
        // 2️ EVEN or ODD NUMBER CHECK
        // -----------------------------
        int num = 7;

        // If the remainder when divided by 2 is 0 → Even, else Odd
        String type = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is: " + type);
        // Output: The number is: Odd


        // -----------------------------
        // 3️ NESTED TERNARY (MULTIPLE CONDITIONS)
        // -----------------------------
        int score = 85;

        // Determine grade using nested ternary operator
        String grade = (score >= 90) ? "A"
                : (score >= 80) ? "B"
                : (score >= 70) ? "C"
                : "F";
        System.out.println("Your grade is: " + grade);
        // Output: Your grade is: B


        // -----------------------------
        // 4️ IF-ELSE vs TERNARY COMPARISON
        // -----------------------------
        int age = 20;
        String message;

        // Traditional if-else statement
        if (age >= 18) {
            message = "Adult";
        } else {
            message = "Minor";
        }
        System.out.println("Using if-else: " + message);

        // Same logic with ternary operator
        message = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Using ternary: " + message);
        // Output: Using ternary: Adult


        // -----------------------------
        // 5️ SUMMARY
        // -----------------------------
        // ?  → means "if condition is true"
        // :  → means "if condition is false"
        // Example:  condition ? valueIfTrue : valueIfFalse
        // Example:  (x > 5) ? "Yes" : "No"

    }
}
