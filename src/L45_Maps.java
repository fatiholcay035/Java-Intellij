import java.util.*;

public class L45_Maps {
    public static void main(String[] args) {

        // --- 1️ Creating a Map ---
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Ali");
        students.put(2, "Veli");
        students.put(3, "Ayşe");

        // --- 2️ Accessing and Listing Data ---
        System.out.println("Student with key 2: " + students.get(2)); // access value by key
        System.out.println("All Keys: " + students.keySet());
        System.out.println("All Values: " + students.values());
        System.out.println("All Entries: " + students.entrySet());

        // --- 3️ Updating Data ---
        students.put(2, "Mehmet"); // replaces value for key 2
        students.replace(3, "Fatma"); // another way to update
        System.out.println("Updated Map: " + students);

        // --- 4️ Using entrySet() with for-each loop ---
        System.out.println("\nUsing entrySet:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // --- 5️ Nested Map Example ---
        Map<String, Map<String, Integer>> school = new HashMap<>();

        Map<String, Integer> classA = new HashMap<>();
        classA.put("Ali", 90);
        classA.put("Ayşe", 85);

        Map<String, Integer> classB = new HashMap<>();
        classB.put("Veli", 78);
        classB.put("Fatma", 92);

        school.put("Class A", classA);
        school.put("Class B", classB);

        // Accessing nested map data
        System.out.println("\nClass A Scores: " + school.get("Class A"));
        System.out.println("Ayşe’s score in Class A: " + school.get("Class A").get("Ayşe"));

        // --- 6️ compute(), computeIfAbsent(), computeIfPresent() ---
        students.compute(1, (k, v) -> v + " Updated"); // modify existing value
        students.computeIfAbsent(4, k -> "New Student"); // adds if key not found
        students.computeIfPresent(2, (k, v) -> v.toUpperCase()); // modifies if key exists
        System.out.println("\nAfter compute methods: " + students);

        // --- 7️ TreeMap (sorted Map) ---
        Map<Integer, String> sortedMap = new TreeMap<>(students);
        System.out.println("\nTreeMap (sorted by key): " + sortedMap);

        /*

            Explanation

    Map Interface

    Stores data in key-value pairs.

    Keys are unique; values can be duplicated.

    Does not maintain order (except TreeMap).

    Common Implementations

    Type	            Features
    HashMap	            Fast, unordered
    LinkedHashMap	    Keeps insertion order
    TreeMap	            Sorted by key

    Key Methods
    Method	            Description
    put(key, value)	    Add or update an element
    get(key)	        Get value by key
    remove(key)	        Remove an entry
    keySet()	        Returns all keys
    values()	        Returns all values
    entrySet()	        Returns all key-value pairs
    compute()	        Updates value using a function
    computeIfAbsent()	Adds if missing
    computeIfPresent()	Updates if exists


    Summary

    Map- stores key-value data

    HashMap- is fast, TreeMap is sorted

    entrySet()- helps loop through both keys & values

    compute()- methods simplify dynamic updates

    Nested Maps are useful for structured data (like classes, users, settings)
    */
    }
}

