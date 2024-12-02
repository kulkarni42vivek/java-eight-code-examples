package Java8;

import java.util.function.BiFunction;

@FunctionalInterface
interface Custom{
    String getConcate(String one  , String two);
}
public class Func {
    public static void main(String[] args) {
        Custom custom = (String one  , String two)->{
            return one + two;
        };
        String answre = custom.getConcate("hello" , "hi");
        System.out.println(answre);

        BiFunction<String , String, Integer> func = (s, s2) -> {
            return (s+s2).length();
        };
        Integer answer = func.apply("hello" , "hi");
        System.out.println(answer);


        // arraylist vs linked list
        // solid kiss dry
        // comparator interface


    }
}