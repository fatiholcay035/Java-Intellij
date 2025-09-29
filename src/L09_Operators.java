public class L09_Operators {
    public static void main(String[] args) {

        // Comparison (Relational) Operators

        int a = 10;
        int b = 5;

        // == checks if two values are equal
        System.out.println("a == b : " + (a == b));  // false

        // != checks if two values are NOT equal
        System.out.println("a != b : " + (a != b));  // true

        // > checks if left value is greater than right value
        System.out.println("a > b : " + (a > b));    // true

        // < checks if left value is smaller than right value
        System.out.println("a < b : " + (a < b));    // false

        // >= checks if left value is greater than or equal to right value
        System.out.println("a >= b : " + (a >= b));  // true

        // <= checks if left value is smaller than or equal to right value
        System.out.println("a <= b : " + (a <= b));  // false

        /*
            Explanation (Comparison Operators)
           Operator	 Meaning	        Example	    Result
            ==	    Equal to	        5 == 5	    true
            !=	    Not equal to	    5 != 3	    true
            >	    Greater than	    10 > 8	    true
            <	    Less than	        2 < 5	    true
            >=	    Greater or equal    10 >= 10	true
            <=	    Less or equal	    7 <= 9	    true

        */

        //Logical Operators

        boolean x = true;
        boolean y = false;

        // && (AND) returns true only if BOTH conditions are true
        System.out.println("x && y : " + (x && y));  // false

        // || (OR) returns true if AT LEAST one condition is true
        System.out.println("x || y : " + (x || y));  // true

        // ! (NOT) reverses the boolean value
        System.out.println("!x : " + (!x));  // false
        System.out.println("!y : " + (!y));  // true

        // Example with numbers
        int a1 = 8;
        int b1 = 12;

        // Using logical AND with comparisons
        System.out.println("(a1 > 5 && b1 > 10) : " + (a1 > 5 && b1 > 10));  // true

        // Using logical OR with comparisons
        System.out.println("(a1 < 5 || b1 > 10) : " + (a1 < 5 || b1 > 10));  // true

        // Using NOT operator
        System.out.println("!(a1 > b1) : " + !(a1 > b1));  // true


        /*

        Explanation (Logical Operators)
        Operator	Name	Description	                Example	            Result
        &&      	AND	    True only if both are true	(5 > 2 && 8 > 3)	true
        ||			OR	    True if at least one is true(5>1 || 7>9)        true
        !	        NOT	    Reverses the result	        !(5 > 2)	        false
         */
    }
}
