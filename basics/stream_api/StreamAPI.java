package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);
        System.out.println(numbers);
        numbers.forEach(number -> System.out.println(number));

        Stream<Integer> stream1 = numbers.stream();
        Stream<Integer> stream2 = stream1.filter(number -> number % 2 == 0);
        Stream<Integer> stream3 = stream2.map(number -> number * 2);
        int sum = stream3.reduce(0, (number1, number2) -> number1 + number2);
        // stream2.forEach(number -> System.out.println(number));
        System.out.println(sum);

    }
}
