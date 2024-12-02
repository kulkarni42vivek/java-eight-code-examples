package Basic;

public class TryCatch {


    public static boolean trust(){
        try{
            return true;
        }
        finally{
            return false;
        }
    }
    public static void main(String[] args) {
        TryCatch obj  = new TryCatch();
        System.out.println(obj.trust());
    }
}
