package Java8.StreamApi;

import java.util.*;

class ProductTwo{
    int id ;
    String name ;
    Long value;

    ProductTwo(int id , String name, Long value){
        this.id = id ;
        this.name = name;
        this.value =value;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}
public class NewProduct {
    public static void main(String[] args) {
        List < ProductTwo > productsList = new ArrayList < ProductTwo > ();
        // Adding Products
        productsList.add(new ProductTwo(1, "HP Laptop", 25000L));
        productsList.add(new ProductTwo(2, "Dell Laptop", 30000L));
        productsList.add(new ProductTwo(3, "Lenevo Laptop", 28000L));
        productsList.add(new ProductTwo(4, "Sony Laptop", 28000L));
        productsList.add(new ProductTwo(5, "Apple Laptop", 90000L));

        Comparator<ProductTwo> comp = (x, y)->{
            return x.getName().compareTo(y.getName());
        };
        productsList.stream().max(comp);
        productsList.stream().min(Comparator.comparing(ProductTwo::getValue));
    }
}
