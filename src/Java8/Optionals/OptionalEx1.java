package Java8.Optionals;

import java.util.Arrays;
import java.util.Optional;

class Custormers {
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Custormers [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }
    public int getId() {
        return id;
    }
    public Custormers(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    int id ;
    String name;
}
public class OptionalEx1 {
    public static void main(String[] args) {
        Optional<Object> obj  = Optional.empty();
        System.out.println(obj);
        Custormers custom = new Custormers(1, null);
        // Optional<String>nameOptional =  Optional.of(custom.getName());
        // System.out.println(nameOptional);
        Optional<String> nameOptional =  Optional.ofNullable(custom.getName());
         // no such element exception
        if(nameOptional.isPresent()){
            System.out.println(nameOptional.get());
        }
        System.out.println(nameOptional.orElse("hello"));
        // nameOptional.orElseThrow(()->  new RuntimeException("runtime exception"));
        String name  = nameOptional.orElseGet(()-> "hello get");
        System.out.println(name);

        String[] array  = new String[]{"afd","adsfd","wefd"};
        Optional<String> any = Arrays.stream(array).filter(x-> x.startsWith("a")).findAny();
        System.out.println(any.orElse("name"));

    }
}
