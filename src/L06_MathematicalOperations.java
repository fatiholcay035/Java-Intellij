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


        // ---------- 1. BASIC PRECEDENCE ----------
        int aa = 10;
        int bb = 5;
        int cc = 2;

        // Multiplication (*) has higher precedence than addition (+)
        int result1 = aa + bb * cc; // same as 10 + (5 * 2)
        System.out.println("10 + 5 * 2 = " + result1);

        // Use parentheses to change the order
        int result2 = (aa + bb) * cc; // (10 + 5) * 2
        System.out.println("(10 + 5) * 2 = " + result2);

        System.out.println("----------------------------------");

        // ---------- 2. Division and Modulus ----------
        int num1 = 20;
        int num2 = 3;

        int division = num1 / num2;    // 20 / 3 = 6 (integer division)
        int modulus = num1 % num2;     // remainder: 20 % 3 = 2

        System.out.println("Division: 20 / 3 = " + division);
        System.out.println("Modulus: 20 % 3 = " + modulus);

        System.out.println("----------------------------------");

        // ---------- 3. Mixed operations ----------
        int mixed = aa + bb * cc - num1 / num2 % cc;
        // Step by step:
        // 1) bb * cc = 5 * 2 = 10
        // 2) num1 / num2 = 20 / 3 = 6
        // 3) 6 % cc = 6 % 2 = 0
        // 4) a + 10 - 0 = 10 + 10 - 0 = 20
        System.out.println("Mixed operations result: " + mixed);

        System.out.println("----------------------------------");

        // ---------- 4. Increment/Decrement precedence ----------
        int xx = 5;
        int yy = ++xx * 2; // ++x is pre-increment: x becomes 6, then multiplied by 2
        System.out.println("Pre-increment: ++xx * 2 = " + yy);

        int zz = xx-- * 2; // x-- is post-decrement: x used first (6), then decremented
        System.out.println("Post-decrement: x-- * 2 = " + zz);
        System.out.println("x after post-decrement: " + xx);

        System.out.println("----------------------------------");

        // ---------- 5. Parentheses always have highest priority ----------
        int complex = ((aa + bb) * (cc + num2)) / 2;
        System.out.println("Complex expression with parentheses: " + complex);
    }
}
