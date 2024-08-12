package JavaCollections.Comparators;

import java.util.*;

public class ComparatorClass {
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


        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"es"));
        studentList.add(new Student(2,"we"));
        studentList.add(new Student(3,"wsfdw"));

        Collections.sort(studentList , (o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(studentList);
        Comparator<Student > compartor = (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        };
        Collections.sort(studentList , compartor);
        System.out.println(studentList);

        Comparator<Student> com = Comparator.comparing(Student::getName);
        Collections.sort(studentList, com);
        System.out.println(studentList);
    }
}
