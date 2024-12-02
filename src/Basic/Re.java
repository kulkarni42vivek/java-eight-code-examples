package Basic;

public class Re {
    void sum(int a,long b){System.out.println("a method invoked");}
    void sum(long a,int b){System.out.println("b method invoked");}

    public static void main(String[] args) {
        Re obj  = new Re();
    }
}
