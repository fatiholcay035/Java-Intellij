// An interface in Java is a collection of abstract methods.
// It is used to achieve full abstraction and multiple inheritance.

// Interface definition
interface Vehicle {
    // Abstract methods (no body)
    void start();
    void stop();

    // Default method (introduced in Java 8)
    default void displayInfo() {
        System.out.println("This is a vehicle interface");
    }

    // Static method (introduced in Java 8)
    static void showRules() {
        System.out.println("All vehicles must follow traffic rules");
    }
}

// Another interface
interface Electric {
    void chargeBattery();
}

// A class can implement multiple interfaces
class Car implements Vehicle, Electric {
    @Override
    public void start() {
        System.out.println("Car started with key");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Car battery is charging");
    }
}

public class L38_Interfaces {
    public static void main(String[] args) {

        // Using interface reference
        Vehicle v = new Car();
        v.start();
        v.stop();
        v.displayInfo(); // Calls default method

        System.out.println();

        // Using static method from interface
        Vehicle.showRules();

        System.out.println();

        // Using Electric interface reference
        Electric e = new Car();
        e.chargeBattery();

        /*

                Explanation Summary:

        Definition:

        An interface is a blueprint of a class that contains abstract methods (methods without a body).

        It defines what a class should do, but not how it does it.

        Interface Rules:

        Declared using the keyword interface.
        → Example: interface Vehicle { ... }

        All methods are public and abstract by default (no need to write public abstract).

        A class uses the keyword implements to use an interface.
        → Example: class Car implements Vehicle

        A class can implement multiple interfaces (unlike classes, which can only extend one class).

        Interfaces cannot have constructors and cannot store object state (no instance variables).

        From Java 8, interfaces can include:

        default methods → methods with a body that can be overridden.

        static methods → methods that belong to the interface itself.

        Purpose of Interfaces:

        To achieve full abstraction.

        To allow multiple inheritance in Java.

        To define a contract that implementing classes must follow.

        Advantages of Using Interfaces:

        Provides flexibility for future code changes.

        Allows unrelated classes to share common behaviors.

        Supports loose coupling in object-oriented design.

        */
    }
}
