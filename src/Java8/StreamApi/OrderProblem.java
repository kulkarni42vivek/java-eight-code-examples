package Java8.StreamApi;

import java.util.*;
import java.util.stream.Collectors;

class Customer{
    int id ;
    String name ;

    Customer(int id , String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Order{
    Customer custom ;
    int orderId;

    public Order(Customer custom, int orderId) {
        this.custom = custom;
        this.orderId = orderId;
    }

    public Customer getCustom() {
        return custom;
    }
}

public class OrderProblem {
    public static void main(String[] args) {
        List<Order> orders  = new ArrayList<>();
        orders.add(new Order(new Customer(1,"vivek") ,2));
        orders.add(new Order(new Customer(2,"vivek") ,2));
        orders.add(new Order(new Customer(3,"vivek") ,2));
        orders.add(new Order(new Customer(1,"vivek") ,2));
        orders.add(new Order(new Customer(1,"vivek") ,2));

        List<Order> answer =  orders.stream().collect(Collectors.toMap(order -> order.getCustom().getId(),
                        order -> order,
                        (order1, order2) -> order1))
                .values()
                .stream()
                .collect(Collectors.toList());

        System.out.println(answer);
    }
}
