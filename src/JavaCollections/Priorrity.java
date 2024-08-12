package JavaCollections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priorrity {
    private static class Book  implements  Comparable<Book>{
        int id ;
        String name ;

        @Override
        public String toString() {
            return "Book{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public Book(int id, String name) {
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
        public int compareTo(Book o) {
            return this.name.compareTo(o.getName());
        }
    }

    public static void main(String[] args) {
        Book book = new Book(1,"vivek");
        Book book2 = new Book(6,"vivedk");
        Book book3 = new Book(5,"svivsek");

        PriorityQueue<Book> pq= new PriorityQueue<>();
        pq.add(book);
        pq.add(book2);
        pq.add(book3);

        for(Book b : pq){
            System.out.println(b);
        }

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
