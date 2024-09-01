package StreamApi;
import java.util.*;
import java.util.stream.Collectors;

public class FlatteningExample {
     static class Customer{
        String name ;
        List<String> emails;

        public Customer(String name, List<String> emails) {
            this.name = name;
            this.emails = emails;
        }

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         public List<String> getEmails() {
             return emails;
         }

         public void setEmails(List<String> emails) {
             this.emails = emails;
         }
     }
    public static void main(String[] args) {
        List<Customer> custom  = List.of(
                new Customer("vivek" , List.of("vivek","two")),
                new Customer("two",List.of("three" , "four")),
                new Customer("four",List.of("asf","sdf"))
        );

        List<String> list  = custom.stream().map(Customer::getName).collect(Collectors.toList());
        System.out.println(list);

        List<String> llist =  custom.stream().flatMap(x-> x.getEmails().stream()).collect(Collectors.toList());
        List<String> lllist = custom.stream().map(Customer::getEmails).flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(llist);
        System.out.println(lllist);


        List<List<List<String>>> values  = List.of(
                List.of(
                        List.of(
                                "vivek", "vijay","kulkarni"
                        ),
                        List.of(
                                "one", "two","three"
                        )
                ),
                List.of(

                        List.of(
                                "four", "five","six"
                        )
                )
        );
        System.out.println(values);

        List<String> collect = values.stream()
                .flatMap(Collection::stream)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        List<String> collect1 = values.stream().flatMap(x -> x.stream().flatMap(Collection::stream)).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);
    }
}
