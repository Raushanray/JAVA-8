package mapAndReduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {

    public static List<Employee> getAllEmployees() {
        return Stream.of(
                new Employee(101, "Ravi", "A", 600000),
                new Employee(102, "Sumit", "B", 40000),
                new Employee(103, "Aman", "C", 690000),
                new Employee(104, "Kriti", "A", 750000),
                new Employee(105, "Tannu", "B", 300000)
        ).collect(Collectors.toList());
    }
}
