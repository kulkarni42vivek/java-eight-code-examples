package Java8.StreamApi;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class ParallelStreamClass2 {
    public static void main(String[] args) {
//        long start  =System.currentTimeMillis();
//        int value = IntStream.range(0,100).reduce(0 , (a,b) -> a+b);
//        System.out.println(value);
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);

        ArrayList<Student> studentList = new ArrayList<>();
        for(int i = 0 ;i< 1000 ; i++){
            studentList.add( new Student(i, "vivek" + i, "vivek" + i, i, "vivek" + i, "vivek" + i,
            i, "vivek" + i, i));
        }
        long start  =System.currentTimeMillis();
        studentList.parallelStream().map(Student::getRank).mapToDouble(x->x).average();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
