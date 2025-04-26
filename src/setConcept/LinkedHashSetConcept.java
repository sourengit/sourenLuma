package setConcept;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetConcept {
    public static void main(String[] args) {
        linkedHashSet();
    }

    public static void linkedHashSet() {
        Set<Integer> lhs = new LinkedHashSet<>(); // Maintains insertion order

        lhs.add(6);
        lhs.add(8);
        lhs.add(6); // Duplicate, won't be added
        lhs.add(8); // Duplicate, won't be added
        lhs.add(2);
        lhs.add(null); // Allows null values
        lhs.add(5);

        System.out.println("Size of LinkedHashSet: " + lhs.size());
        System.out.println("LinkedHashSet: " + lhs); // Order preserved

        boolean contains = lhs.contains(5);
        System.out.println("The set contains 5: " + contains);

        lhs.remove(8);
        System.out.println("After removing value 8: " + lhs);

        Set<Integer> lhs2 = new LinkedHashSet<>();
        lhs2.add(100);
        lhs2.add(19);
        lhs2.add(8);
        lhs2.add(12);
        lhs2.add(2); // Duplicate, won't be added

        lhs.addAll(lhs2);
        System.out.println("2nd set added to 1st set: " + lhs); // Maintains insertion order

        System.out.println("1st set is empty: " + lhs.isEmpty());

        Iterator<Integer> iterator = lhs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // Printing in insertion order
        }
    }
}
