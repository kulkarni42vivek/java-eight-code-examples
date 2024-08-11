package StreamApi;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IteratorStream {
    public static void main(String[] args) {
        String[] array = {"f","s","s","s"};
        IntStream.range(0, array.length).mapToObj(x-> array[x]).collect(Collectors.toList());
    }
}
