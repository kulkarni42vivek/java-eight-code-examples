package DesignPatterns;

import java.sql.SQLOutput;


// singleton tests

final class OneClass implements  Cloneable {
    private int value ;
    private OneClass(int value){
        this.value  = value;
    }
    private static OneClass obj;
    public static synchronized OneClass getObject(int value){
        if(obj == null){
            obj = new OneClass(value);
            return obj ;
        }
        return obj;
    }

    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
}


final class Single{
    private int value  ;
    private static Single obj;
    private Single(int value){
        this.value  = value;
    }
    public static synchronized Single getSingleObj(int value){
        if(obj == null){
            obj =  new Single(value);
            return obj;
        }
        return obj;
    }
}

interface one{
    int a  = 5;
    default void method(){
        System.out.println("hello");
    }
    void test();
}
abstract class Two2 implements one{

}

class Two{
    public void add(int a , long b){
        System.out.println("asf");
        System.out.println(a+b);
    }
    public void add(double a , double  b){
        System.out.println(a+b);
    }
}
public class SingleTon {
    public static void main(String[] args) {
        Two obj  = new Two();
        obj.add(12.2,45.2);
    }
}
