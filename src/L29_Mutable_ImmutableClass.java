
// Mutable and Immutable Classes in Java

/*
 Mutable Object → Can be changed after creation.
 Immutable Object → Cannot be changed after creation.
*/

class MutablePerson {
    private String name;
    private int age;

    // Constructor
    public MutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods (object can be modified)
    public String getName() {
        return name;
    }

    public void setName(String name) { // allows modification
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) { // allows modification
        this.age = age;
    }
}

final class ImmutablePerson {
    private final String name;
    private final int age;

    // Constructor sets values once
    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Only getters (no setters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class L29_Mutable_ImmutableClass {
    public static void main(String[] args) {

        // ----------- Mutable Example -----------
        MutablePerson person1 = new MutablePerson("Ali", 25);
        System.out.println("Mutable before change: " + person1.getName() + ", " + person1.getAge());

        // Can be changed after creation
        person1.setName("Veli");
        person1.setAge(30);
        System.out.println("Mutable after change: " + person1.getName() + ", " + person1.getAge());


        // ----------- Immutable Example -----------
        ImmutablePerson person2 = new ImmutablePerson("Ayşe", 22);
        System.out.println("\nImmutable: " + person2.getName() + ", " + person2.getAge());

        // Cannot change fields (no setters)
        // person2.setName("Fatma"); //  not allowed
        // person2.age = 25;         //  private and final

        // To "change" values, create a new object
        ImmutablePerson newPerson = new ImmutablePerson("Fatma", 25);
        System.out.println("New Immutable Object: " + newPerson.getName() + ", " + newPerson.getAge());
    }
}

/*
  SUMMARY:
- Mutable class → has setter methods → object state can change.
- Immutable class → all fields are final, no setters → object state cannot change.
- Example: String class in Java is immutable.
*/