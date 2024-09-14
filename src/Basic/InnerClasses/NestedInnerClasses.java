package Basic.InnerClasses;

class Outer{
    int x ;

    class Inner{
        public void method(){
            System.out.println("hello from inner class");
        }
    }
}

public class NestedInnerClasses {
    public static void main(String[] args) {
        Outer outer  = new Outer();
        Outer.Inner inner  = outer.new Inner();
        inner.method();

    }
}
