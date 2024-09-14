package SolidPrinciples;

interface PrinterC{
    public void print();
    public void fax();
}

// if we implement that interface then we have to implement both the methods but we might not need
// all the methods
// what we should do ?? -- make other interfaces
interface PrinterAlone{
    public void print();
}
interface FaxAlone{
    public void fax();
}
public class InterfaceSegregation {
    public static void main(String[] args) {
        // class should not be forced to implemnt th interfaces that are not use to class
        // interfaces needs to be segregated
    }
}
