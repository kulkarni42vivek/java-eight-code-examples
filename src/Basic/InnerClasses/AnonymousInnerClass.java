package Basic.InnerClasses;

class Outer3{
    public void method(){
        System.out.println("inner>>>");
    }
}
public class AnonymousInnerClass {
    Outer3 outer = new Outer3(){
        public void method(){
            super.method();
        }
    };
    public static void main(String[] args) {
        AnonymousInnerClass classobj = new AnonymousInnerClass();
        classobj.outer.method();
    }
}
