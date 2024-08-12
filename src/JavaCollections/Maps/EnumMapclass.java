package JavaCollections.Maps;

import java.util.EnumMap;

public class EnumMapclass {
    enum DAYS{
        MONDAY , TUEDAY , SUNDAY, WEDNESDAY
    }
    public static void main(String[] args) {
        EnumMap<DAYS, String> emap  = new EnumMap<>(DAYS.class);
        emap.put(DAYS.MONDAY , "AFS");
        emap.put(DAYS.TUEDAY , "SERW");
        emap.put(DAYS.WEDNESDAY , "WEREW");

        System.out.println(emap);
    }
}
