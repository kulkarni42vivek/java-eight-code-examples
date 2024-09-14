package Basic.InnerClasses;

interface Outer5{
    public void method();
}
public class AnonymousInner2 {
    public static void main(String[] args) {
        Outer5 ob = new Outer5() {
            @Override
            public void method() {
                System.out.println("jin");
            }
        };
        ob.method();
    }
}
