package JavaCollections.Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NullFirstNullsLast {
    static class Student{
        int id ;
        String name ;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        List<ComparatorClass.Student> studentList = new ArrayList<>();
        studentList.add(new ComparatorClass.Student(1,"es"));
        studentList.add(new ComparatorClass.Student(2,"we"));
        studentList.add(new ComparatorClass.Student(3,"wsfdw"));
        studentList.add(new ComparatorClass.Student(3,null));

        Comparator<ComparatorClass.Student> com = Comparator.comparing(ComparatorClass.Student::getName , Comparator.nullsLast(String::compareTo));
        Collections.sort(studentList , com);
        System.out.println(studentList);
        Collections.sort(studentList, Comparator.comparing(ComparatorClass.Student::getName,Comparator.nullsFirst(String::compareTo)));
        System.out.println(studentList);
    }
}
