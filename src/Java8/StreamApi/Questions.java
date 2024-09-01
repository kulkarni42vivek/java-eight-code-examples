package Java8.StreamApi;

public class Questions {

    public static void pattern17(int n) {
        int spaces = n-1;
        for(int i = 1;i<=n ;i++){
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print((char)(j + 64));
            }

            // Print decreasing part of the pattern
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char)(j + 64));
            }

            spaces--;
            System.out.println();
        }

    }
    public static void main(String[] args) {
//        String[] array  = new String[]{"hello","jhelli","hello"};
//        Map<String ,Long> map  = Arrays.stream(array).collect(Collectors.groupingBy(x -> x , Collectors.counting()));
//        System.out.println(map);
//
//        Arrays.stream(array).max(Comparator.comparingInt(String::length));
//
//        int[] intarray   = new int[]{12,14,54,21,11,10,9};
//        List<String> list = Arrays.asList("Hello", " ", "world", "!");
//
//        String collect = list.stream().collect(Collectors.joining());
//        System.out.println(collect);
        pattern17(5);
    }
}
