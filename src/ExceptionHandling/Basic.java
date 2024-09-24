package ExceptionHandling;

public class Basic {
    // errors -> syntax errors/ compile error, logical errors ,runtime error
    public static void main(String[] args) {
        try{
            int a = 10 /0;
        }
        catch (Exception e){
            System.out.println("e");
        }
        finally {
            System.out.println("hello");
        }



        // hirarchy
        // object > throwable > error AND Exception
        // error > virtual machine erro and linkage error
        // virtual > out of memory and stack overflow
        // linkage > class format and noclassdeffounderror

        // runtime
    }
}
