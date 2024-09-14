package Basic.InnerClasses;

class Outer2{
    public void OuterMethod(){
        System.out.println("outer method");
    }
    static class Inner{
        public static  void innerMethod(){
            System.out.println("inner mthod");
        }
    }
}
public class StaticNestedClass {
    public static void main(String[] args) {
        Outer2.Inner.innerMethod();
    }
}
