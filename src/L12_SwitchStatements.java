public class L12_SwitchStatements {
    public static void main(String[] args) {


        // 1 BASIC SWITCH STATEMENT

        int day = 3;

        // switch checks the value of a variable
        // and runs the matching "case" block
        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // stops the switch after execution
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number!");
                // default runs if no case matches
        }

        // Output: Wednesday


        // -----------------------------
        // 2 SWITCH WITH STRING
        // -----------------------------
        String fruit = "Apple";

        switch (fruit) {
            case "Apple":
                System.out.println("Apples are red or green.");
                break;
            case "Banana":
                System.out.println("Bananas are yellow.");
                break;
            case "Orange":
                System.out.println("Oranges are orange!");
                break;
            default:
                System.out.println("Unknown fruit.");
        }

        // Output: Apples are red or green.


        // -----------------------------
        // 3️ SWITCH WITHOUT BREAK
        // -----------------------------
        int number = 2;

        // When "break" is missing, next cases also run (fall-through)
        switch (number) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Not in range.");
        }

        // Output:
        // Two
        // Three


        // -----------------------------
        // 4️ SWITCH WITH MULTIPLE CASES (Java 14+ feature)
        // -----------------------------
        int month = 8;

        // Modern switch using arrow syntax (Java 14 and later)
        switch (month) {
            case 12, 1, 2 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("Invalid month!");
        }

        // Output: Summer


        // -----------------------------
        // 5️ SWITCH AS AN EXPRESSION (Java 14+)
        // -----------------------------
        int score = 90;

        // switch can return a value
        String grade = switch (score / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };

        System.out.println("Your grade is: " + grade);
        // Output: Your grade is: A


        // -----------------------------
        // SUMMARY
        // -----------------------------
        // switch(variable) {
        //    case value1: ... break;
        //    case value2: ... break;
        //    default: ...
        // }
        //
        // - "break" stops execution after a case.
        // - "default" runs if no case matches.
        // - Works with int, char, String, enum, etc.
        // - Modern Java allows arrow (->) syntax and multiple cases.

    }
}
