package Java8.StreamApi;
import java.util.*;
import java.util.stream.Collectors;

class Patient{
    int age;
    String name ;
    String disease;
    int bill;
    public Patient(int age, String name, String disease, int bill) {
        super();
        this.age = age;
        this.name = name;
        this.disease = disease;
        this.bill = bill;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDisease() {
        return disease;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public int getBill() {
        return bill;
    }
    public void setBill(int bill) {
        this.bill = bill;
    }
    public Patient() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Patient [age=" + age + ", name=" + name + ", disease=" + disease + ", bill=" + bill + "]";
    }
}

public class Two{
public static void main(String[] args) {
    Patient p1 = new Patient(20,"p1","asdf",20);
    Patient p2 = new Patient(20,"p1","assdf",20);
    Patient p3 = new Patient(20,"p1","asdf",40);
    Patient p4 = new Patient(20,"p1","asdf",20);
    List<Patient >plist =List.of(p1,p2,p3,p4);
    System.out.println(plist.stream().filter(p->p.getDisease().equals("asdf")).collect(Collectors.toList()));

    System.out.println(plist.stream().filter(p->p.getDisease().equals("asdf")).mapToInt(e->e.getBill()).average().getAsDouble());
}
}

