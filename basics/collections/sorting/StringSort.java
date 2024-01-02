package collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSort {
    public static void main(String args[]) {
        List<String> arr = new ArrayList<String>();
        arr.add("Hello");
        arr.add("World");
        arr.add("Java");
        arr.add("Collections");
        arr.add("Sorting");

        System.out.println("Before sorting: ");
        System.out.println("arr: " + arr);

        // Sort the array list
        Comparator<String> comp = new Comparator<String>() {
            public int compare(String a, String b) {
                if (a.length() > b.length()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        // Sort the array list
        Collections.sort(arr, comp);

        System.out.println("After sorting: ");
        System.out.println("arr: " + arr);
    }
}
