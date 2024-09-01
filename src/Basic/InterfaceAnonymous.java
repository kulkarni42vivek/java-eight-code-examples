package Basic;

import org.w3c.dom.ls.LSOutput;

interface Test1{
    void testMethod();
}
interface Test2{
    int testMethod(int value, int value2);
}
public class InterfaceAnonymous {
    public static void main(String[] args) {
        Test1  t1 = new Test1() {
            @Override
            public void testMethod() {
                System.out.println("hello");
            }
        };
        t1.testMethod();

        Test1 t2 = () -> System.out.println("hello");
        t2.testMethod();
        Test2 test2 = (value, value2) -> value+value2;
        System.out.println(test2.testMethod(2,5));

        Test2 re= (value, value2) -> {
            if(value>value2){
                throw new RuntimeException("exception ");
            }
            else{
                return value-value2;
            }
        };
        System.out.println(re.testMethod(35,25));

    }



}
