// L31_Varargs.java
// Varargs (Variable Arguments) in Java

/*
Varargs allows a method to accept a variable number of arguments.
You don't need to know how many arguments will be passed in advance.
*/

public class L31_Varargs {

    // Example 1: Method with varargs parameter
    public static void printNumbers(int... numbers) {
        System.out.println("Total numbers: " + numbers.length);
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    // Example 2: Varargs with other parameters
    public static void showInfo(String name, int... scores) {
        System.out.println("Name: " + name);
        System.out.println("Scores count: " + scores.length);
        for (int s : scores) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // You can pass any number of arguments
        printNumbers(1, 2, 3);
        printNumbers(5, 10, 15, 20);
        printNumbers(); // Works even with no arguments

        // Example with multiple parameters
        showInfo("Ali", 90, 80, 70);
        showInfo("Veli", 100);
        showInfo("Ayşe"); // no score

        // You can also pass an array
        int[] arr = {10, 20, 30, 40};
        printNumbers(arr);
    }
}

/*
SUMMARY:
- Syntax: methodName(type... variableName)
- Inside the method, varargs behaves like an array.
- Only one varargs parameter is allowed in a method.
- It must be the last parameter in the parameter list.
*/
