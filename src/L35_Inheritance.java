// Inheritance allows a class (child) to use the fields and methods of another class (parent).
// It helps to avoid code duplication and improve code reusability.

class Animal {
    String name = "Generic Animal";

    // Constructor of parent class
    Animal() {
        System.out.println("Animal constructor called");
    }

    // Method in parent class
    void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // Another method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// The 'extends' keyword is used to create a subclass (child class)
class Dog extends Animal {
    String name = "Dog";

    // Constructor of child class
    Dog() {
        // The parent constructor is automatically called first (super())
        System.out.println("Dog constructor called");
    }

    // Method overriding: same method name and parameters as in the parent class
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    // Method specific to Dog class
    void fetch() {
        System.out.println("Dog is fetching the ball");
    }
}

public class L35_Inheritance {
    public static void main(String[] args) {

        // Creating a Dog object
        Dog dog = new Dog();
        System.out.println();

        // Accessing parent class method
        dog.sleep(); // Inherited from Animal class

        // Accessing overridden method
        dog.makeSound(); // Uses Dog's version (Overriding)

        // Accessing subclass-specific method
        dog.fetch();

        System.out.println();

        // Accessing variables
        System.out.println("Name from Dog class: " + dog.name); // Dog
        System.out.println("Name from Animal class: " + ((Animal)dog).name); // Generic Animal

        System.out.println();

        // Upcasting example (using data type of parent)
        Animal animalRef = new Dog(); // Reference type is Animal, object type is Dog
        animalRef.makeSound(); // Calls Dog's method because of overriding
        animalRef.sleep(); // Calls Animal's method
        // animalRef.fetch(); // Not accessible because Animal type doesn’t have this method

        /*

        Explanation Summary:

        Inheritance Keyword:

        extends → used to inherit from another class.

        Example: class Dog extends Animal.

        Constructor Call in Inheritance:

        When a child object is created, the parent constructor runs first automatically.

        This is because Java inserts an implicit super() call at the beginning of the child constructor.

        Accessing Class Members:

        Child class inherits all non-private fields and methods.

        You can override methods to give new behavior.

        Overriding:

        Happens when a child class defines a method with the same name and parameters as the parent.

        The child’s version replaces the parent’s version at runtime.

        Data Type Usage (Upcasting):

        When a parent reference points to a child object (Animal animalRef = new Dog();),
        only parent methods are visible at compile time,
        but overridden methods execute the child version at runtime (Dynamic Polymorphism).


         */

    }
}
