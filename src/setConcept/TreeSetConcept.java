package setConcept;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetConcept {
    public static void main(String[] args) {
        treeSet();
    }

    public static void treeSet() {
        Set<Integer> ts = new TreeSet<>(); // TreeSet maintains sorted order

        ts.add(6);
        ts.add(8);
        ts.add(6); // Duplicate, won't be added
        ts.add(8); // Duplicate, won't be added
        ts.add(2);
        // ts.add(null); // TreeSet does NOT allow null values
        ts.add(5);

        System.out.println("Size of TreeSet: " + ts.size());
        System.out.println("TreeSet: " + ts); // Elements will be sorted

        boolean contains = ts.contains(5);
        System.out.println("The set contains 5: " + contains);

        ts.remove(8);
        System.out.println("After removing value 8: " + ts);

        Set<Integer> ts2 = new TreeSet<>();
        ts2.add(100);
        ts2.add(19);
        ts2.add(8);
        ts2.add(12);
        ts2.add(2); // Duplicate, won't be added

        ts.addAll(ts2);
        System.out.println("2nd set added to 1st set: " + ts); // Sorted merge

        System.out.println("1st set is empty: " + ts.isEmpty());

        Iterator<Integer> iterator = ts.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // Printing elements in sorted order
        }
    }
}