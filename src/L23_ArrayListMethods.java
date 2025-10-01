import java.util.ArrayList;
import java.util.Collections;

public class L23_ArrayListMethods {
    public static void main(String[] args) {

        // 1️ Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // 2️ Adding elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Fruits list: " + fruits);

        // 3️ Accessing elements by index
        System.out.println("First fruit: " + fruits.get(0)); // Output: Apple

        // 4️ Changing (updating) an element
        fruits.set(1, "Orange");
        System.out.println("After update: " + fruits);

        // 5️⃣ Removing elements
        fruits.remove("Cherry"); // Remove by value
        System.out.println("After removing Cherry: " + fruits);

        fruits.remove(0); // Remove by index
        System.out.println("After removing index 0: " + fruits);

        // 6️⃣ Checking if an element exists
        System.out.println("Contains Orange? " + fruits.contains("Orange")); // true

        // 7️⃣ Getting the size of the list
        System.out.println("List size: " + fruits.size());

        // 8️⃣ Sorting the ArrayList
        fruits.add("Mango");
        fruits.add("Pineapple");
        Collections.sort(fruits);
        System.out.println("Sorted list: " + fruits);

        // 9️⃣ Reversing the ArrayList
        Collections.reverse(fruits);
        System.out.println("Reversed list: " + fruits);

        // 🔟 Clearing all elements
        fruits.clear();
        System.out.println("After clear: " + fruits); // []

        // 🔹 Integer list example
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        Collections.sort(numbers);
        System.out.println("Sorted numbers: " + numbers);

        /*

        Explanation

        Method	                Description	                        Example

        add()	                Adds element to the list	        list.add("Apple")
        get(index)	            Returns element at given index	    list.get(0)
        set(index, value)	    Updates element at given index	    list.set(1, "Orange")
        remove(index or value)	Removes element by index or value	list.remove("Apple")
        contains(value)	        Checks if list has the value	    list.contains("Mango")
        size()	                Returns number of elements	        list.size()
        clear()	                Removes all elements	            list.clear()
        Collections.sort()	    Sorts list in ascending order	    Collections.sort(list)
        Collections.reverse()	Reverses list order	                Collections.reverse(list)

        */


    }
}
