package Java8.StreamApi;
import java.net.CookieHandler;
import java.util.*;
import java.util.stream.Collectors;

public class StudentOperations {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));

        //		1- Find list of students whose first name starts with alphabet A
        System.out.println(list.stream().filter(x-> x.getFirstName().startsWith("A")).collect(Collectors.toList()));
        System.out.println("----------------------------------------------------");
        //		2- Group The Student By Department Names
        Map<String, List<Student>> mapData = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName));
        Map<String,Long> mapData2 = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.counting()));
        for(Map.Entry<String , List<Student>> entry : mapData.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
        System.out.println("----------------------------------------------------");
        System.out.println(list.stream().count());
        System.out.println("----------------------------------------------------");
        // 4- Find the max age of student
        System.out.println(list.stream().mapToInt(x->x.getAge()).max().getAsInt());
        System.out.println("----------------------------------------------------");
        System.out.println(list.stream().map(x->x.getDepartmantName()).distinct().collect(Collectors.toList()));
        System.out.println("----------------------------------------------------");
        System.out.println(list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting())));
        System.out.println("----------------------------------------------------");
        System.out.println(list.stream().collect(Collectors.groupingBy(Student::getGender , Collectors.averagingInt(Student::getAge))));
        System.out.println("----------------------------------------------------");
        Map.Entry<String, Long> map = list.stream()
                .collect(Collectors.groupingBy(Student::getDepartmantName , Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get();
        System.out.println(map);
        System.out.println("----------------------------------------------------");
        // 11- Find the Students who stays in Delhi and sort them by their names
        System.out.println(list.stream().filter(x-> x.getCity().equals("Delhi")).sorted(Comparator.comparing(Student::getFirstName)));
        System.out.println("----------------------------------------------------");
        System.out.println(list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.averagingDouble(Student::getAge))));
        System.out.println("----------------------------------------------------");
        list.stream().
                collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.averagingInt(Student::getRank)));

        int[] array  = new int[]{12,5,12,41,06,23,121,110};
        Integer x = Arrays.stream(array).mapToObj(v->(Integer)v).max((o1, o2) -> o1-o2).get();
        System.out.println(x);

        Long collect = list.stream()
                .mapToDouble(Student::getAge)
                .boxed()
                .collect(Collectors.collectingAndThen(
                        Collectors.averagingDouble(Double::doubleValue),
                        avg -> Math.round(avg)
                ));

        System.out.println(collect);

        String[] str = new String[]{"hello","world"};
        List<String> collect1 = Arrays.stream(str)
                .collect(
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                m -> m.stream().map(v -> v.toUpperCase())
                                        .collect(Collectors.toList())
                        )
                );
        System.out.println(collect1);


        List<String> words = Arrays.asList("hello", "world", "java");
        words.stream().collect(
                Collectors.collectingAndThen(
                        Collectors.toList(),
                        list1 -> list1.stream()
                                .mapToInt(String::length)
                                .sum()
                )
        );

        LinkedHashMap<String, Integer>map8 = list.stream().collect(Collectors.toMap(Student::getDepartmantName , Student::getAge , (integer, integer2) -> integer , () -> new LinkedHashMap<>()));
        System.out.println(map8);
    }
}
