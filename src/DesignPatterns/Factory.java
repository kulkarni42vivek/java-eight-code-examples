package DesignPatterns;

interface Connector{
    public void connect();
}

class MySqlConnector implements  Connector{
    @Override
    public void connect() {
        System.out.println("jdbc:mysql://...");
    }
}

class PostgresConnector implements  Connector{
    @Override
    public void connect() {
        System.out.println("jdbc:pOSTGRES://...");
    }
}

interface FactoryClass{
    public Connector getConnectorInfo();
}
class MySqlConnectionFactory implements FactoryClass{

    @Override
    public Connector getConnectorInfo() {
        return new MySqlConnector();
    }
}

class PostgresConnectionFactory implements  FactoryClass{
    @Override
    public Connector getConnectorInfo() {
        return new PostgresConnector();
    }
}


abstract class Animal{
    public abstract void sound();
}

class Cat extends  Animal{
    public void sound(){
        System.out.println("cat sound");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("dog sound");
    }
}

class SoundFactory{
    Animal getAnimalSound(String animal){
        if(animal == "Dog"){
            return new Dog();
        }
        else{
            return new Cat();
        }
    }
}

public class Factory {
    public static void main(String[] args) {
        PostgresConnectionFactory conn = new PostgresConnectionFactory();
        Connector con = conn.getConnectorInfo();
        con.connect();


        SoundFactory sf = new SoundFactory();
        Animal obj = sf.getAnimalSound("dSog");
        obj.sound();

        int[][] arr = new int[][]{{5,1,1},{1,2,3}};
        for(int[] a:arr){
            for(int b:a){
                if(b==2){
                    break;
                }
                else{
                    System.out.println(b);
                }
            }
        }
    }
}
