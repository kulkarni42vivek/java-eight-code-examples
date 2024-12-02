package Basic;

class One{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize is called !!");
        super.finalize();
    }
}
public class FinalizeCode {
    public static void main(String[] args) {
        One one  = new One();
        one = null;

    }
}
