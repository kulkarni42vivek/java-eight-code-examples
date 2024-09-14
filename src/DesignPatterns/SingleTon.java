package DesignPatterns;

final class Single{
    private int value  ;
    private static Single obj;
    private Single(int value){
        this.value  = value;
    }
    public static synchronized Single getSingleObj(int value){
        if(obj == null){
            return new Single(value);
        }
        return obj;
    }
}

public class SingleTon {
    public static void main(String[] args) {
        Single object  = Single.getSingleObj(10);
    }
}
