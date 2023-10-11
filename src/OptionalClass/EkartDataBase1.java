package OptionalClass;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase1 {


    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(105, "Ravi", "ravi@gmail.com", Arrays.asList("397937955", "336654725")),
                new Customer(106, "Shivam", "shivam@gmail.com", Arrays.asList("897937955", "96654725")),
                new Customer(107, "Aman", "aman@gmail.com", Arrays.asList("857937955", "56654725")),
                new Customer(108, "Kapil", "kapil@gmail.com", Arrays.asList("157937955", "35654725"))
        ).collect(Collectors.toList());
    }
}
