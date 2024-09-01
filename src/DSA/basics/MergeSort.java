package DSA.basics;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = new int[] {3,6,5,47,45,12,33,22,11};
        mergeSo(array );
        System.out.println(array);
    }

    public static void mergeSo(int[] nums) {
        mergeS(nums, 0 , nums.length-1);
    }

    public static void mergeS(int[] array , int start , int end){
        if(start <end){
            int mid = start + (end- start )/2;
            mergeS(array ,start , mid);
            mergeS(array ,mid+1 , end);
            merge(array ,start, mid ,end);
        }
    }
    public static void merge(int[] array , int start , int mid , int end){
        int leftLength = mid- start+1;
        int rightLength = end - mid;
        int[] left = new int[leftLength];
        int[] right = new int[rightLength];

        for(int i = 0 ;i<leftLength ; i++){
            left[i] = array[start+i];
        }
        for(int i = 0;i<rightLength ; i++){
            right[i] = array[mid+i+1];
        }

        int i = 0 ;
        int j = 0 ;
        int k = start;
        while(i<leftLength && j<rightLength){
            if(left[i]<right[j]){
                array[k] = left[i];
                i++;
            }
            else{
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<leftLength){
            array[k] = left[i];
            i++ ; k++ ;
        }
        while(j<rightLength){
            array[k] = right[j];
            j++ ; k++ ;
        }
    }
}
