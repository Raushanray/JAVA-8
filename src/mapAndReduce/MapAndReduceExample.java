package mapAndReduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapAndReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 6, 8, 9, 7, 2, 9);

        List<String> words = Arrays.asList("corejava", "springboot", "hibernate");

        int sum = 0;
        for (int no : numbers) {
            sum = sum + no;
        }
        System.out.println(sum);

        //using java 8
        int sum1 = numbers.stream().mapToInt(i -> i).sum();
        System.out.println(sum1);


        Integer reduceSum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduceSum);

        Optional<Integer> reduceSumWithMethodRefrence = numbers.stream().reduce(Integer::sum);
        System.out.println(reduceSumWithMethodRefrence.get());

        Integer mulResults = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(mulResults);

        Integer maxValue = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxValue);


        Integer maxValueWithMethodRefrence = numbers.stream().reduce(Integer::max).get();
        System.out.println(maxValueWithMethodRefrence);


        String longestString = words.stream().reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get();
        System.out.println(longestString);
    }
}
