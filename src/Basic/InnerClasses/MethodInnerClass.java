package Basic.InnerClasses;

class Outer1{
    public void method(){
        class Inner{
            public void innerMethod(){
                System.out.println("inner method");
            }
        }
        Inner innner = new Inner();
        innner.innerMethod();
    }
}
public class MethodInnerClass {
    public static void main(String[] args) {
        Outer1 ou= new Outer1();
        ou.method();
    }
}
