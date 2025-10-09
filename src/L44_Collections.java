import java.util.*;

public class L44_Collections {

    public static void main(String[] args) {

        // --- List Example ---
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("List: " + fruits);

        // --- Set Example ---
        Set<String> cities = new HashSet<>();
        cities.add("Izmir");
        cities.add("Ankara");
        cities.add("Izmir"); // duplicate ignored
        System.out.println("Set: " + cities);

        // --- Map Example ---
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Ali");
        students.put(2, "Veli");
        students.put(3, "Ayşe");
        System.out.println("Map: " + students);

        // --- Using Collections class ---
        Collections.sort(fruits);
        System.out.println("Sorted List: " + fruits);



        /*

        What is Collection?
        A Collection in Java is a group of objects stored and managed together.
        The Collections Framework provides classes and interfaces to work with data easily.

        Main Interfaces

        Interface	        Description         	        Example Class

        List	            Ordered, allows duplicates	    ArrayList, LinkedList
        Set	                Unordered, no duplicates	    HashSet, TreeSet
        Map	                Key-Value pairs	                HashMap, TreeMap

        Collections Class

        Collections is a utility class that provides static methods to work with collections.

        Common methods:

        sort(list) → sorts the list

        max(collection) → returns the maximum element

        min(collection) → returns the minimum element

        reverse(list) → reverses order



         Key Points

         List keeps order and allows duplicates
         Set removes duplicates automatically
         Map stores data as key-value pairs
         Collections class provides helpful static methods



        */


    }
}
