package Debugging_with_stream_debugger;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpDataBase {
    public static List<Employee> getEmployees() {
        return Stream.of(
                new Employee(101, "Raju", "DEV", 50000),
                new Employee(120, "Shivam", "It", 40000),
                new Employee(106, "Raju", "Test", 60000),
                new Employee(118, "Tannu", "QA", 70000),
                new Employee(156, "Tannu", "Developer", 80000),
                new Employee(126, "Aman", "Data analyst", 750000),
                new Employee(1001, "Guriya", "MCA", 20000),
                new Employee(200, "Priyanka", "MCA", 25000),
                new Employee(203, "Babata", "DEV", 90000)
        ).collect(Collectors.toList());
    }
}
