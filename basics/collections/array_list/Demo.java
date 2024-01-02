package collections.array_list;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String args[]) {
        ArrayList<String> stringList = new ArrayList<String>();
        List<Integer> integerList = new ArrayList<Integer>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        stringList.add("Collections");
        stringList.add("Framework");

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        System.out.println("stringList: " + stringList);
        System.out.println("integerList: " + integerList);

        for (String str : stringList) {
            System.out.println(str);
        }

        for (Integer i : integerList) {
            System.out.println(i);
        }

        System.out.println(integerList.get(0));
    }
}
