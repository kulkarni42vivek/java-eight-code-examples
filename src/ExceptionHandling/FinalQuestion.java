package ExceptionHandling;

import java.util.Arrays;

public class FinalQuestion {
    public static void main(String[] args) {
        int i = function();
        System.out.println(i);
    }

    private static int function() {
        try{

            return 1;

        }catch (Exception e){
            System.out.println("catch block");
        }
        finally {
            System.out.println("finally block");
        }
        return 10;
    }
}
