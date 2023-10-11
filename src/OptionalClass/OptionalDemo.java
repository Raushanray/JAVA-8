package OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static Customer getCustomerById(String email) throws Exception {
        List<Customer> customers = EkartDataBase1.getAll();
        return customers.stream().filter(customer -> customer.getEmail().equals(email)).findAny()
                .orElseThrow(() -> new Exception("no customer is present with this email id.."));

    }

    public static void main(String[] args) throws Exception {

        Customer customer = new Customer(105, "Ravi", "ravi@gmial.com", Arrays.asList("397937955", "336654725"));

        //empty()
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        //of
//        Optional<String> customerEmailOptional = Optional.of(customer.getEmail());
//        System.out.println(customerEmailOptional);


        //ofNullable
        Optional<String> customerEmailOptional1 = Optional.ofNullable(customer.getEmail());
       /* if (customerEmailOptional1.isPresent())
        System.out.println(customerEmailOptional1.get());
*/
//        System.out.println(customerEmailOptional1.get());

//        System.out.println(customerEmailOptional1.orElse("ravi@gmail.com"));

//        System.out.println(customerEmailOptional1.orElseThrow(() -> new IllegalArgumentException("email is not present")));

        System.out.println(customerEmailOptional1.map(String::toUpperCase).orElseGet(() -> "default email......"));
        getCustomerById("rabigsd");
    }
}
