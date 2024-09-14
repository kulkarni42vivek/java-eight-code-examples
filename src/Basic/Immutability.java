package Basic;
final class Immut{
    private final String value;
    private final String value2;

    Immut(String value, String value2) {
        this.value = value;
        this.value2 = value2;
    }

}
public class Immutability {
    public static void main(String[] args) {
        Immut immut  = new Immut("one","two");
    }
}
