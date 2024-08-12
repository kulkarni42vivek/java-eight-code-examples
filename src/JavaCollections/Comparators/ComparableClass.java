package JavaCollections.Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableClass {
    static class Student implements Comparable<Student> {
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
        public int compareTo(Student obj){
            return this.name.compareTo(obj.name);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        List<Student > studentList = new ArrayList<>();
        studentList.add(new Student(1 ,"vivek"));
        studentList.add(new Student(2,"wer"));
        studentList.add(new Student(3,"wersdf"));
        studentList.add(new Student(3,"awersdf"));
        Collections.sort(studentList);

        System.out.println(studentList);
    }
}
