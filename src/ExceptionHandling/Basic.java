package ExceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class Basic {
    // errors -> syntax errors/ compile error, logical errors ,runtime error
    public static void main(String[] args) {
        try{
            int a = 10 /0;
        }
        catch (Exception e){
            System.out.println("e");
        }
        finally {
            System.out.println("hello");
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] array = list.toArray(new Integer[0]);
        System.out.println(array[1]); // apple


        // hirarchy
        // object > throwable > error AND Exception
        // error > virtual machine erro and linkage error
        // virtual > out of memory and stack overflow
        // linkage > class format and noclassdeffounderror

        // runtime
    }
}
