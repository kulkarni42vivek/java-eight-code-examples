package SolidPrinciples;

class User{
    public void createUser(){
        System.out.println("create user");
    }
}
class Printer{
    public void printing(){
        System.out.println("pringint task");
    }
}
public class SingleResponsibility {
    public static void main(String[] args) {
        // single resposibiltu over shere
        // user should be create user and printer should print .
        // user should not do the both tasks

    }
}
