import java.util.*;

public class L43_Iterator_ListIterator {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Veli");
        names.add("Ayşe");

        // --- Using Iterator ---
        System.out.println("Using Iterator:");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) { // checks if there is next element
            String name = it.next(); // gets the next element
            System.out.println(name);
        }

        // --- Using ListIterator ---
        System.out.println("\nUsing ListIterator (Forward):");
        ListIterator<String> listIt = names.listIterator();
        while (listIt.hasNext()) {
            System.out.println(listIt.next());
        }

        System.out.println("\nUsing ListIterator (Backward):");
        while (listIt.hasPrevious()) { // move backward
            System.out.println(listIt.previous());
        }
        /*
    Explanation

    Iterator

    Used to traverse (loop through) elements in a collection.

    Works for all collections (List, Set, etc.)

    Main methods:

    hasNext() → checks if there is a next element

    next() → returns the next element

    remove() → removes the current element

    ListIterator

    Used only with List (like ArrayList or LinkedList).

    Can move forward and backward.

    Main methods:

    hasNext(), next()

    hasPrevious(), previous()

    add(), remove(), set()
         */
    }
}
