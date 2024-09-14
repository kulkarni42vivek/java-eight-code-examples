package DSA.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstLastOcc {
    public static void main(String[] args) {
        int arr[] = new int[]{5,7,7,8,8,10};
        int x = 7;

        System.out.println(getPosition(arr,x));
        System.out.println(getSecondPosition(arr, x));

        ArrayList<Integer> arraylist = new ArrayList<>();


    }

    private static int getSecondPosition(int[] arr, int x) {
        int start  = 0 ;
        int end  = arr.length-1;
        int answer = -1;
        while(start<=end){
            int mid = (start+ end)/2;
            if(arr[mid] == x){
                answer = mid;
                start = mid+1;
            }
            else if(arr[mid]>x){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return answer;
    }

    private static int getPosition(int[] arr, int x) {
        int start  = 0 ;
        int end  = arr.length-1;
        int answer = -1;
        while(start<=end){
            int mid = (start+ end)/2;
            if(arr[mid] == x){
                answer = mid;
                end = mid-1;
            }
            else if(arr[mid]>x){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return answer;
    }
}
