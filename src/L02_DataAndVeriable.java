public class L02_DataAndVeriable {
    public static void main(String[] args) {

        // ===== PRIMITIVE DATA TYPES =====

        //INTEGERS DATA TYPES

        // byte: Stores whole numbers from -128 to 127
        byte smallNumber = 100;
        System.out.println("byte value: " + smallNumber);

        // short: Stores whole numbers from -32,768 to 32,767
        short shortNumber = 30000;
        System.out.println("short value: " + shortNumber);

        // int: Stores whole numbers from -2,147,483,648 to 2,147,483,647
        int age = 25;
        System.out.println("int value: " + age);

        // long: Stores very large whole numbers
        long distanceToMoon = 384_400_000L; // "L" means long type
        System.out.println("long value: " + distanceToMoon);

        //FLOAT DATA TYPES

        // float: Stores decimal numbers, use "f" at the end
        float pi = 3.14f;
        System.out.println("float value: " + pi);

        // double: Stores decimal numbers with more precision
        double price = 19.99;
        System.out.println("double value: " + price);

        //BOOLEAN DATA TYPES

        // boolean: Stores true or false
        boolean isJavaFun = true;
        System.out.println("boolean value: " + isJavaFun);

        //CHARACTER DATA TYPES

        // char: Stores a single character, enclosed in single quotes
        char grade = 'A';
        System.out.println("char value: " + grade);


        // ===== NON-PRIMITIVE DATA TYPE =====

        // String: Stores a sequence of characters (text)
        String name = "Fatih Olcay";
        System.out.println("String value: " + name);

        // Array: Stores multiple values of the same data type
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array first element: " + numbers[0]);

        // Wrapper classes: Allow primitive types to be used as objects
        Integer numberObject = 100;
        Double priceObject = 19.99;
        Boolean resultObject = false;

        System.out.println("Integer object: " + numberObject);
        System.out.println("Double object: " + priceObject);
        System.out.println("Boolean object: " + resultObject);

        // Example of type casting (changing one type to another)
        double castExample = (double) age; // int to double
        System.out.println("Type casting (int to double): " + castExample);

        // ===== DECLARATION =====
        // Declaration means creating a variable and telling Java its data type
        // But we don't give it a value yet.

        int number;          // declared, but not assigned
        String name1;         // declared, but not assigned
        double price1;        // declared, but not assigned

        // ===== ASSIGNMENT =====
        // Assignment means giving a value to the variable using "="

        number = 10;         // value assigned to number
        name1 = "Fatih";      // value assigned to name
        price1 = 25.99;       // value assigned to price

        // Print the assigned values
        System.out.println("Number: " + number);
        System.out.println("Name: " + name1);
        System.out.println("Price: " + price1);

        // ===== DECLARATION + ASSIGNMENT (together) =====
        // You can also declare and assign in the same line.

        int age1 = 30;                 // declared and assigned
        boolean isStudent = false;    // declared and assigned
        char grade1 = 'A';             // declared and assigned

        System.out.println("Age: " + age1);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Grade: " + grade1);

        // ===== REASSIGNMENT =====
        // You can change (reassign) the value of a variable later

        number = 20;    // new value assigned to number
        price1 = 19.99;  // new value assigned to price

        System.out.println("Updated Number: " + number);
        System.out.println("Updated Price: " + price1);

        // ===== FINAL VARIABLES =====
        // "final" keyword makes a variable constant (cannot be changed)
        final double PI = 3.14159;
        System.out.println("Constant PI: " + PI);

        // PI = 3.15; // ❌ Error! You cannot reassign a final variable



    }
}
