package DSA.basics;

public class QuickSort {
    public static int[] quickSort(int[] nums) {
        quickSortPivot(nums, 0 , nums.length-1);
        return nums;
    }
    public static void quickSortPivot(int[]nums , int start, int end){
        if(start>end){
            return;
        }
        int pivot = getPivot(nums,start, end);
        quickSortPivot(nums,start, pivot-1);
        quickSortPivot(nums,pivot+1, end);
    }
    public static int getPivot(int[] nums,int start ,int end){
        int pivot = nums[end];
        int low = start ;
        for(int i= start; i<=end-1; i++){
            if(pivot < nums[i]){
                swap(nums, i , low);
            }
        }
        swap(nums,low+1,end);
        return low+1;
    }
    public static void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[]answer = quickSort(new int[]{11,12,44,51,25,21,11,23,9});
        System.out.println(answer);
    }
}
