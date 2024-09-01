package DSA.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SecondLargest {
    public static void main(String[] args) {
        unionArray(new int[]{1, 2, 2, 3},new int[]{4, 5, 7});
    }

    public static void unionArray(int[] nums1, int[] nums2) {
        int pointer1 = 0;
        int pointer2 = 0 ;

        int len1 = nums1.length;
        int len2 = nums2.length;
        ArrayList<Integer> list = new ArrayList<>();
        while(pointer1 < len1 && pointer2 < len2){
            if(nums1[pointer1] > nums2[pointer2]){
                pointer2++;
            }
            else if(nums1[pointer1] < nums2[pointer2]){
                pointer1++;
            }
            else{
                list.add(nums1[pointer1]);
                pointer1++;
                pointer2++;
            }
        }

        int[] alist = new int[list.size()];
        for(int i = 0 ;i<list.size();i++){
            alist[i] = list.get(i);
        }
        System.out.println(alist);
    }
}
