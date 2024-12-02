package StringConstantPoolCode;

public class Test {
    public static void main(String[] args) {
        String a  = "hello";
        String b  = "hello";
        String c  = "hel";
        String d  = "lo";

        System.out.println(b == "hel" +( "lo"));
        System.out.println(a == (c+d));
        System.out.println(a == "hel" +d);
        System.out.println(a == c + "lo");
        System.out.println(a.equals(c+"lo"));
    }
}
