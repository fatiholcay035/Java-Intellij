public class L10_IfElseStatements {
    public static void main(String[] args) {

        //BASIC IF STATEMENT////////////////////////////
        int number = 10;

        // if statement checks a condition
        if (number > 5) {
            // this block runs only if the condition is true
            System.out.println("The number is greater than 5.");
        }
        System.out.println("Program ended.");

        //IF-ELSE STATEMENT///////////////////////////////

        int number1 = 3;

        // if the condition is true, the first block runs
        // otherwise, the else block runs
        if (number1 >= 5) {
            System.out.println("The number is greater than or equal to 5.");
        } else {
            System.out.println("The number is less than 5.");
        }

        //IF-ELSE LADDER///////////////////////////////

        int score = 85;

        // multiple conditions using else if
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        //NESTED IF STATEMENTS///////////////////////////////

        int age = 20;
        boolean hasTicket = true;

        // nested if: one if inside another
        if (age >= 18) {
            if (hasTicket) {
                System.out.println("You can enter the concert!");
            } else {
                System.out.println("You need a ticket to enter.");
            }
        } else {
            System.out.println("You are too young to enter.");
        }

        /*
            Summary Table*************************************************
            Structure	Description	                            Example

            if	        Executes code if condition is true	    if (x > 10)

            if–else	    Executes one block if true, another
                        if false	                            if (x > 10) { ... } else { ... }

            else if	    Adds more conditions	                else if (x == 10)

            nested if	if inside another if	                if (x > 10) { if (y > 5) { ... } }

         */



    }
}
