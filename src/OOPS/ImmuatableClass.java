package OOPS;

import java.util.HashMap;

final class Immut{
    private final String str ;
    private final HashMap<String , String> hmap;

    Immut(String str , HashMap<String, String> hmap){
        this.str = str;
        HashMap<String , String> temp = new HashMap<>();
        hmap.forEach((key , value)->{
            temp.put(key, value);
        });
        this.hmap = temp;
    }

    public String getStr() {
        return str;
    }

    public HashMap<String, String> getHmap() {
        HashMap<String , String> tempMap  = new HashMap<>();
        this.hmap.forEach((key, value)->{
            tempMap.put(key, value);
        });
        return tempMap;
    }
}

public class ImmuatableClass {
    public static void main(String[] args) {

    }
}
