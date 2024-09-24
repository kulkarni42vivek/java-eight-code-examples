package ExceptionHandling;

public class ExceptionPropagation {
    public static void main(String[] args) {
        try{
            level1();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    private static void level1() {
        level2();
    }

    private static void level2() {
        level3();
    }

    private static void level3() {
        System.out.println(10/0);
    }
}
