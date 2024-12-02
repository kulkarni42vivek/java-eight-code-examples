package OOPS;

public class OverLoading {
    public static void getEx(int a , long b ){
        System.out.println("int --> long");
    }
    public static void getEx(long a , int b){
        System.out.println("long --> int");
    }
    public static void main(String[] args) {
//        getEx(10,25);
//        code wont work as it creates ambiguilty
    }
}
