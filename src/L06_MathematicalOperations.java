public class L06_MathematicalOperations {
    public static void main(String[] args) {

        // ---------- 1. Basic Arithmetic Operators ----------
        int a = 15;
        int b = 4;

        System.out.println("Basic Arithmetic:");
        System.out.println("Addition: " + (a + b));       // +
        System.out.println("Subtraction: " + (a - b));    // -
        System.out.println("Multiplication: " + (a * b)); // *
        System.out.println("Division: " + (a / b));       // integer division
        System.out.println("Division (double): " + ((double)a / b)); // floating-point division
        System.out.println("Modulus (remainder): " + (a % b)); // %
        System.out.println("----------------------------------");

        // ---------- 2. Increment and Decrement ----------
        int x = 5;
        int y = 5;

        System.out.println("Increment and Decrement:");
        System.out.println("x before increment: " + x);
        x++; // increment by 1
        System.out.println("x after increment: " + x);

        System.out.println("y before decrement: " + y);
        y--; // decrement by 1
        System.out.println("y after decrement: " + y);
        System.out.println("----------------------------------");

        // ---------- 3. Shorthand Assignment Operators ----------
        int num = 10;
        System.out.println("Shorthand Assignment Operators:");
        System.out.println("Original num: " + num);
        num += 5; // num = num + 5
        System.out.println("After += 5: " + num);
        num -= 3; // num = num - 3
        System.out.println("After -= 3: " + num);
        num *= 2; // num = num * 2
        System.out.println("After *= 2: " + num);
        num /= 4; // num = num / 4
        System.out.println("After /= 4: " + num);
        num %= 3; // num = num % 3
        System.out.println("After %= 3: " + num);
        System.out.println("----------------------------------");

        // ---------- 4. Math Class Methods ----------
        System.out.println("Math Class Methods:");
        double val = 9.7;
        System.out.println("Original value: " + val);
        System.out.println("Math.round(): " + Math.round(val)); // round to nearest integer
        System.out.println("Math.floor(): " + Math.floor(val)); // round down
        System.out.println("Math.ceil(): " + Math.ceil(val));   // round up
        System.out.println("Math.sqrt(16): " + Math.sqrt(16));  // square root
        System.out.println("Math.pow(2, 3): " + Math.pow(2, 3)); // 2^3
        System.out.println("Math.abs(-10): " + Math.abs(-10));  // absolute value
        System.out.println("Math.max(5, 10): " + Math.max(5, 10)); // maximum
        System.out.println("Math.min(5, 10): " + Math.min(5, 10)); // minimum
        System.out.println("----------------------------------");

        // ---------- 5. Random Number ----------
        double randomValue = Math.random(); // random value between 0.0 and 1.0
        System.out.println("Random value (0.0 - 1.0): " + randomValue);

        int randomInt = (int)(Math.random() * 100); // random integer between 0 and 99
        System.out.println("Random integer (0 - 99): " + randomInt);
    }
}
