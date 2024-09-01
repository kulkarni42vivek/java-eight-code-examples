package Java8.FunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierClass {
    public static void main(String[] args) {
        Supplier<String> supplier =() -> "hellli";

        System.out.println(supplier.get());
    }
}
