package ExceptionHandling;

class CustomE extends Exception{
    public CustomE(){
        super("Custom exception called !");
    }
}

public class CustomException {
    public static void main(String[] args) {
        try{
            int value  = 10/0 ;
        }
        catch(CustomE e){

        }
        catch(Exception e){
            throw new CustomE("value");
        }
    }
}
