public class L26_Constructors {

    // Instance variables (fields)
    String name;
    int age;

    // 1️ Default Constructor (no parameters)
    // This constructor is called when no arguments are passed while creating an object.
    public L26_Constructors() {
        System.out.println("Default constructor is called!");
        name = "Unknown";
        age = 0;
    }

    // 2️ Parameterized Constructor (with parameters)
    // This constructor allows assigning custom values when the object is created.
    public L26_Constructors(String personName, int personAge) {
        System.out.println("Parameterized constructor is called!");
        name = personName;
        age = personAge;
    }

    // 3️ Copy Constructor
    // This constructor creates a new object by copying another object’s values.
    public L26_Constructors(L26_Constructors other) {
        System.out.println("Copy constructor is called!");
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display object details
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        // Using Default Constructor
        L26_Constructors person1 = new L26_Constructors();
        person1.displayInfo();  // Output: Name: Unknown, Age: 0

        System.out.println("-------------------");

        // Using Parameterized Constructor
        L26_Constructors person2 = new L26_Constructors("Alice", 25);
        person2.displayInfo();  // Output: Name: Alice, Age: 25

        System.out.println("-------------------");

        // Using Copy Constructor
        L26_Constructors person3 = new L26_Constructors(person2);
        person3.displayInfo();  // Output: Name: Alice, Age: 25
    }
}
