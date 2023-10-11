package parralel_stream;

import java.util.List;
import java.util.stream.IntStream;

public class ParralelStreamExample {
    public static void main(String[] args) {

        long start = 0;
        long end = 0;

//        start = System.currentTimeMillis();
//        IntStream.range(1,100).forEach(System.out::println);
//        end = System.currentTimeMillis();
//
//        System.out.println("plan stream took take time: " + (end - start));
//
//        System.out.println("============================================");
//
//        start = System.currentTimeMillis();
//        IntStream.range(1,100).parallel().forEach(System.out::println);
//        end = System.currentTimeMillis();
//
//        System.out.println("parallel stream took take time: " + (end - start));


        IntStream.range(1, 10).forEach(x -> {
            System.out.println("Thread :" + Thread.currentThread().getName() + " : " + x);
        });

        System.out.println("===================================================");

        IntStream.range(1, 10).parallel().forEach(x -> {
            System.out.println("Thread :" + Thread.currentThread().getName() + " : " + x);
        });


        //work with employees data
        List<Employee> allEmployees = EmployeeDatabase.getAllEmployees();

        start = System.currentTimeMillis();
        double salaryWithStream = allEmployees.stream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("normal stream took take time: " + (end - start) + " Ave Salary " + salaryWithStream);

        System.out.println("===============================================================");

        start = System.currentTimeMillis();
        double salaryWithParallelStream = allEmployees.parallelStream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("parallel stream took take time: " + (end - start) + " Ave Salary " + salaryWithParallelStream);


    }
}
