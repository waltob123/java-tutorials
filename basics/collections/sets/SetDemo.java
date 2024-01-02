package collections.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String args[]) {
        Set<Integer> integerSet = new HashSet<Integer>();
        Set<String> stringSet = new TreeSet<String>();
        integerSet.add(5);
        integerSet.add(6);
        integerSet.add(10);
        integerSet.add(20);

        stringSet.add("Hello");
        stringSet.add("World");
        stringSet.add("Java");
        stringSet.add("Collection");
        stringSet.add("Framework");
        stringSet.add("TreeSet");

        System.out.println("Set size");
        System.out.println(integerSet.size());
        System.out.println(stringSet.size());

        Iterator<Integer> iterator = integerSet.iterator();
        Iterator<String> stringIterator = stringSet.iterator();

        System.out.println("Iterator");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }

        System.out.println("Enhanced for loop");
        for (Integer n : integerSet) {
            System.out.println(n);
        }

        for (String str : stringSet) {
            System.out.println(str);
        }
    }
}
