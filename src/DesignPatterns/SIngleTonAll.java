package DesignPatterns;

final class SinlgetonLazy{
    private  int value1 ;
    private static SinlgetonLazy obj  ;
    private SinlgetonLazy(int value){
        this.value1 = value;
    }

    public static synchronized SinlgetonLazy getLazyInstance(int value){
        if(obj == null){
            obj  = new SinlgetonLazy(value);
            return obj;
        }
        return obj;
    }
}
final class SingletonEager{
    private static final SingletonEager obj  = new SingletonEager();

    private SingletonEager(){
        System.out.println("class created");
    }

    public static synchronized SingletonEager getEagerInstance(){
        return obj;
    }
}
public class SIngleTonAll {
    public static void main(String[] args) {
        SinlgetonLazy obj  = SinlgetonLazy.getLazyInstance(10);
        System.out.println(obj);
        SingletonEager obj2  = SingletonEager.getEagerInstance();
        System.out.println(obj2);
    }
}
