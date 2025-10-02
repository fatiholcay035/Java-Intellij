public class L28_PassByValue {

    // Method that tries to change a primitive value
    static void changeNumber(int num) {
        num = num + 10;
        System.out.println("Inside method (num): " + num);
    }

    // Method that tries to change an object's value
    static void changeName(Person p) {
        p.name = "Alice";
        System.out.println("Inside method (p.name): " + p.name);
    }

    // Method that replaces the object reference
    static void reassignPerson(Person p) {
        p = new Person("Charlie");
        System.out.println("Inside method (reassigned p.name): " + p.name);
    }

    public static void main(String[] args) {

        // Example 1: Primitive type
        int number = 20;
        System.out.println("Before method call (number): " + number);
        changeNumber(number);
        System.out.println("After method call (number): " + number);

        System.out.println("-------------------");

        // Example 2: Object reference type
        Person person1 = new Person("Bob");
        System.out.println("Before method call (person1.name): " + person1.name);
        changeName(person1);
        System.out.println("After method call (person1.name): " + person1.name);

        System.out.println("-------------------");

        // Example 3: Reassigning the object reference
        Person person2 = new Person("David");
        System.out.println("Before method call (person2.name): " + person2.name);
        reassignPerson(person2);
        System.out.println("After method call (person2.name): " + person2.name);
    }
}

// Helper class for object examples
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}
