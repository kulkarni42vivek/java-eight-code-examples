package Java8.FunctionalInterfaces;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateExamples {
    public static void main(String[] args) {
        Predicate<Integer> pred = (x)-> x%2==0;
        System.out.println(pred.test(25));
        System.out.println(pred.test(12));
    }
}
