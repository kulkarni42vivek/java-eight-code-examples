package DSA.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class basic {

    public static void main(String[] args) {
        int x = LinearSearch(new int[]{12,14,16,2,5} , 5);
        int y = largest(new int[]{12,14,16,2,5} );
        int z = slargest(new int[]{12,14,16,2,5} );
        int xx = maxCount(new int[]{0,1,1,0,0,1,1,1});
        rotateByOne(new int[]{12,14,16,2,5});
        rotateByK(new int[]{12,14,16,2,5} , 2);
        moveZeroes(new int[]{0,1,4,0,5,2});
        removeDuplicatesFromSorted(new int[]{1,1,1,2,3,3,5,5});
        int  xxx = findMissing(new int[]{0,2,3,1,4});
        System.out.println(xxx);
        findsingle(new int[]{0,0,-3,2,5,2,-3});
        leaders(new int[]{1,2,5,3,1,2});
    }

    private static int[] leaders(int[] ints) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ;i< ints.length;i++){
            int k = 0;
            for( k= i+1;k<ints.length;k++){
                if(ints[i]<ints[k]){
                    break;
                }
            }
            if(k == ints.length){
                list.add(ints[i]);
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0 ;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }



    private static int findMissing(int[] ints) {
        Arrays.sort(ints);
        int answer = ints.length;
        for(int i = 0 ;i<ints.length;i++){
            if(ints[i] != i){
                answer = i;
                break;
            }
        }
        return answer;
    }


    private static int findsingle(int[] ints) {
        Arrays.sort(ints);
        int answer = ints[ints.length-1] ;
        for(int i = 0 ;i<ints.length-1;i=i+2){
            if(ints[i] != ints[i+1]){
                answer = ints[i];
                break;
            }
        }
        return answer;
    }

    private static void removeDuplicatesFromSorted(int[] array) {
        int n = array.length;
        int j = 0;
        for(int i = 0 ;i<n-1;i++){
            if(array[i] != array[i+1]){
                array[j++] = array[i];
            }
        }
        array[j++]= array[n-1];
        System.out.println(array);
    }

    private static void moveZeroes(int[] array) {
        int pointer =  0;
        for(int i = 0 ;i<array.length;i++){
            if(array[i] != 0){
                array[pointer] = array[i];
                pointer++;
            }
        }
        for(int i = pointer ; i< array.length;i++){
            array[i] = 0;
        }
        System.out.println(array);
    }

    private static void rotateByOne(int[] ints) {
        int temp = ints[0];
        for(int i = 1;i<ints.length;i++){
            ints[i-1] = ints[i];
        }
        ints[ints.length-1] = temp;
    }

    private static void rotateByK(int[] ints, int k ){
        k = k%ints.length;
        reverse(ints, 0 , k-1);
        reverse(ints,k ,ints.length-1 );
        reverse(ints, 0, ints.length-1);

        System.out.println(ints);
    }

    private static void reverse(int[] array, int start, int end) {
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    private static int maxCount(int[] ints) {
        int maxCount = 0;
        int count = 0 ;

        for(int i =  0 ;i< ints.length;i++){
            if(ints[i] == 1 ){
                count++;
                maxCount = Math.max(count , maxCount);
            }
            else{
                count = 0;
            }
        }
        return maxCount;
    }

    private static int slargest(int[] ints) {
        int secondLargest= Integer.MIN_VALUE;
        int firstLarget= Integer.MIN_VALUE;

        for(int i= 0 ;i< ints.length;i++){
            if(firstLarget> ints[i]){
                secondLargest = firstLarget;
                firstLarget = ints[i];
            }
        }
        return secondLargest;
    }

    private static int largest(int[] ints) {
        int max = Integer.MIN_VALUE;
        for(int i= 0 ;i< ints.length;i++){
            if(ints[i] > max){
                max = ints[i];
            }
        }
        return max;
    }

    private static int LinearSearch(int[] ints, int i) {

        for(int k = 0 ;k< ints.length;k++){
            if(ints[k] == i){
                return k;
            }
        }
        return -1;
    }
}
