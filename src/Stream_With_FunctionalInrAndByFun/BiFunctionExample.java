package Stream_With_FunctionalInrAndByFun;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionExample implements BiFunction<List<Integer>, List<Integer>, List<Integer>> {
    public static void main(String[] args) {
        BiFunction biFunction = new BiFunctionExample();
        List<Integer> list1 = Stream.of(1, 2, 3, 8, 5, 9, 11, 25).collect(Collectors.toList());
        List<Integer> list2 = Stream.of(5, 12, 3, 18, 5, 20, 11, 25).collect(Collectors.toList());
        System.out.println("Traditional Approach " + biFunction.apply(list1, list2));


        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction1 = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> l1, List<Integer> l2) {
                return Stream.of(l1, l2)
                        .flatMap(List::stream)
                        .distinct()
                        .collect(Collectors.toList());
            }
        };
        System.out.println("Annonymous Impl : " + biFunction1.apply(list1, list2));


        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction12 = (l1, l2) -> {
            return Stream.of(l1, l2)
                    .flatMap(List::stream)
                    .distinct()
                    .collect(Collectors.toList());
        };

        Function<List<Integer>, List<Integer>> sortedFunction = (lists) -> lists.stream().sorted().collect(Collectors.toList());
        System.out.println("Lambda approach : " + biFunction12.andThen(sortedFunction).apply(list1, list2));


        Map<String, Integer> map = new HashMap<>();
        map.put("Ravi", 5000);
        map.put("Sumit", 15000);
        map.put("Tannu", 25000);

        BiFunction<String, Integer, Integer> increaseSalaryUsingBifunction = new BiFunction<String, Integer, Integer>() {
            @Override
            public Integer apply(String key, Integer value) {
                return value + 1000;
            }
        };
/*
        map.replaceAll(increaseSalaryUsingBifunction);
        System.out.println(map);*/


        /*BiFunction<String,Integer,Integer> increaseSalaryUsingBifunctionAndLambda =( key,  value) -> value + 2000;

        map.replaceAll(increaseSalaryUsingBifunctionAndLambda);
        System.out.println(map);*/


        map.replaceAll((key, value) -> value + 3000);
        System.out.println(map);

    }

    @Override
    public List<Integer> apply(List<Integer> list1, List<Integer> list2) {
        return Stream.of(list1, list2)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }
}
