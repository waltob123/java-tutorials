package collections.maps;

import java.util.Map;
import java.util.HashMap;

public class MapDemo {
    public static void main(String args[]) {
        Map<String, Integer> student = new HashMap<String, Integer>();
        student.put("John", 25);
        student.put("Jane", 24);
        student.put("Jack", 26);
        student.put("Jill", 23);
        System.out.println(student);

        System.out.println(student.get("John"));

        System.out.println(student.containsKey("John"));

        System.out.println(student.containsValue(25));

        System.out.println(student.size());

        for (String key : student.keySet()) {
            System.out.println(key + " : " + student.get(key));
        }
        Integer removedStudent = student.remove("John");
        System.out.println(removedStudent);
        System.out.println(student);
    }
}
