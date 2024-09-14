package SolidPrinciples;

import java.util.HashSet;

public class SingleResponsibility {
    public static void main(String[] args) {
        int[] array  = new int[]{12,41,54,14,12,25,25,54};
        HashSet<Integer> hset  = new HashSet<>();
        for(int i :array){
            if(!hset.add(i)){
                System.out.println(i);
            }
        }
    }
}
