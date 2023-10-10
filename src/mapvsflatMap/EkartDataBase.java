package mapvsflatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {


public static List<Customer> getAll() {
    return Stream.of(
//            new Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725")),
//            new Customer(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947")),
//            new Customer(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")),
//            new Customer(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467")),
                new Customer(105, "Ravi","ravi@gmail.com", Arrays.asList("397937955", "336654725")),
                new Customer(106, "Shivam","shivam@gmail.com", Arrays.asList("897937955", "96654725")),
                new Customer(107, "Aman","aman@gmail.com", Arrays.asList("857937955", "56654725")),
                new Customer(108, "Kapil","kapil@gmail.com", Arrays.asList("157937955", "35654725"))
    ).collect(Collectors.toList());
}
}
