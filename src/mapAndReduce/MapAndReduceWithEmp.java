package mapAndReduce;

public class MapAndReduceWithEmp {
    public static void main(String[] args) {
        //get Employee whose grade A
        //get salary
        double avgSalary = EmployeeDatabase.getAllEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();
        System.out.println(avgSalary);

        //get sum all employee whose grade A
        double sum = EmployeeDatabase.getAllEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .sum();
        System.out.println(sum);

    }
}
