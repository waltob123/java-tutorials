package collections.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;

class StringComparable implements Comparable<StringComparable> {
    String str;

    StringComparable(String str) {
        this.str = str;
    }

    public int compareTo(StringComparable that) {
        return this.str.length() > that.str.length() ? 1 : -1;
    }

    public String toString() {
        return this.str;
    }
}

public class Sorting {
    public static void main(String args[]) {
        // Create an array list
        List<Integer> arr = new ArrayList<Integer>();
        List<Integer> arr2 = new ArrayList<Integer>();
        List<StringComparable> arr3 = Arrays.asList(new StringComparable("abc"), new StringComparable("ab"), new StringComparable("abcd"));

        // Before sorting
        System.out.println("Before sorting: ");
        System.out.println(arr3);
        System.out.println();

        // Sort the arr3
        Collections.sort(arr3);

        // After sorting
        System.out.println("After sorting: ");
        System.out.println(arr3);

        // Add elements to the array list
        arr.add(18);
        arr.add(27);
        arr.add(83);
        arr.add(94);
        arr.add(95);

        arr2.add(11);
        arr2.add(29);
        arr2.add(30);
        arr2.add(46);
        arr2.add(52);

        System.out.println("Before sorting: ");
        System.out.println("arr: " + arr);
        System.out.println("arr2: " + arr2);

        // Sort the array list
        // Collections.sort(arr);
        // Collections.sort(arr2);

        // System.out.println("After sorting: ");
        // System.out.println("arr: " + arr);
        // System.out.println("arr2: " + arr2);

        // Comparator
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (a % 10 > b % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        // Sort the array list
        Collections.sort(arr, comp);
        Collections.sort(arr2, comp);

        System.out.println("After sorting: ");
        System.out.println("arr: " + arr);
        System.out.println("arr2: " + arr2);
    }
}
