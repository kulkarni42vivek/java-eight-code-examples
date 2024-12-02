package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie implements Comparable<Movie> {
    int id ;
    String name ;
    public Movie(int id , String name ){
        this.id  = id;
        this.name = name;
    }
    public int compareTo(Movie obj){
        if(obj.name.compareTo(this.name)>0){
            return 1;
        }
        else if(obj.name.compareTo(this.name) == 0){
            return 0;
        }
        else {
            return -1;
        }
    }
    public String toString(){
        return "movie name ->> "  + this.name;
    }
}

class Movie2{
    int id ;
    String name ;
    public Movie2(int id , String name ){
        this.id  = id;
        this.name = name;
    }

    public String toString(){
        return "movie id ->> "  + this.id;
    }
}
class NameComparator implements  Comparator<Movie2>{

    @Override
    public int compare(Movie2 o1, Movie2 o2) {
        return o1.id - o2.id;
    }
}
public class Comp {
    public static void main(String[] args) {
        List<Movie> llist = Arrays.asList(new Movie(2, "va")
                , new Movie(2, "va")
                , new Movie(13, "asf")
                , new Movie(11, "srt"));
        Collections.sort(llist );
        System.out.println(llist);

        List<Movie2> llist2 = Arrays.asList(new Movie2(2, "va")
                , new Movie2(2, "va")
                , new Movie2(13, "asf")
                , new Movie2(11, "srt"));
        llist2.sort(new NameComparator());
        System.out.println(llist2);
    }
}
