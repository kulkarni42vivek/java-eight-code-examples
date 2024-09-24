package DesignPatterns;

class Car{
    int id ;
    String color ;
    String modelName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
class Builder{
    int id ;
    String color ;
    String modelName;

    Builder setColor(String color){
        this.color  = color;
        return this ;
    }
    Builder setmodelName(String modelName){
        this.modelName = modelName;
        return this;
    }
    Builder setId(int id){
        this.id = id ;
        return this;
    }

    public Car Build(){
        Car car = new Car();
        car.setId(this.id);
        car.setModelName(this.modelName);
        car.setColor(this.color);
        return car;
    }
}
class Bus{
    int id ;
    static int a;

    Bus(){
        a = 5;
    }
}
public class CarBuilder {
    public static void main(String[] args) {
        Car car = new Builder()
                .setColor("cool")
                .setId(25)
                .setmodelName("alto")
                .Build();
        System.out.println(car);

        Bus b  = new Bus();
        System.out.println(b.a);
    }
}
