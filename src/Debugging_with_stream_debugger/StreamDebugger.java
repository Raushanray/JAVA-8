package Debugging_with_stream_debugger;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDebugger {
    public static void main(String[] args) {

        List<String> names = EmpDataBase.getEmployees()
                .stream().filter(employee -> employee.getSalary() > 40000)
                .map(Employee::getName)
                .distinct()
                .sorted()
                .skip(0)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(names);

    }
}
