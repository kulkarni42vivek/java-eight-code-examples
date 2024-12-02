package OOPS;

class Student implements  Cloneable{
    int id ;
    Address address;

    Student(int id , Address address){
        this.id = id ;
        this.address = address;
    }
    protected Object clone() throws CloneNotSupportedException {
        Student st = (Student) super.clone();
        return st;
    }
}
class Address{
    int lane ;
    String address;

    Address(int lane , String address){
        this.lane  = lane;
        this.address  = address;
    }
}

class Student2 implements  Cloneable{
    int id ;
    Address2 address;

    Student2(int id , Address2 address){
        this.id = id ;
        this.address = address;
    }
    protected Object clone() throws CloneNotSupportedException {
        Student2 st = (Student2) super.clone();
        st.address = address.clone();
        return st;
    }
}
class Address2 implements  Cloneable{
    int lane ;
    String address;

    Address2(int lane , String address){
        this.lane  = lane;
        this.address  = address;
    }

    @Override
    public Address2 clone() {
        try {
            Address2 clone = (Address2) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

public class DeepCopyShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address  addr = new Address(1,"afd");
        Student student  = new Student(10 , addr);
        Student student2  = (Student) student.clone();

        // shallow copy
        System.out.println(student2.address == student.address);


        // deep copy is below

        Address2  addr2 = new Address2(1,"afd");
        Student2 student21  = new Student2(10 , addr2);
        Student2 student3  = (Student2) student21.clone();

        // deep copy
        System.out.println(student21.address == student3.address);
    }
}
