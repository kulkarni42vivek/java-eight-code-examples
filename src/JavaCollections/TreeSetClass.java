package JavaCollections;
import java.util.*;
public class TreeSetClass {
    static class Student{
        int id ;

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

        String name;
    }
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // does not allow null elements
        //        set.add(null);
        System.out.println(set);

        TreeSet<Student> s = new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName()));
        s.add(new Student(11,"vivek"));
        s.add(new Student(12,"asdf"));
        s.add(new Student(13,"vivetek"));
        s.add(new Student(14,"visdvek"));
        System.out.println(s);

        TreeSet<String> tset  = new TreeSet<>(Collections.reverseOrder());
        tset.add("jhelo");
        tset.add("get");
        tset.add("sfwe");
        tset.add("wer");


    }
}
