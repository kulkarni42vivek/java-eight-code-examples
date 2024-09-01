package DSA.basics;

public class MergesortAlo {
    public static int[] mergeSort(int[] nums) {
        mergeSortvalue(nums, 0 , nums.length-1);
        return nums;
    }

    private static void mergeSortvalue(int[] nums, int low, int high) {
        if(low<high){
            int mid = low + (high-low)/2;
            mergeSortvalue(nums, low, mid );
            mergeSortvalue(nums,mid+1, high);
            merge(nums, low, mid , high);
        }
    }

    private static void merge(int[] nums, int low, int mid, int high) {
        int leftLength = mid-low+1;
        int rightLength = high- mid;
        int[] leftarray = new int[leftLength];
        int[] rightarray = new int[rightLength];

        for(int i = 0;i<leftLength;i++){
            leftarray[i] = nums[low+i];
        }
        for(int i= 0 ;i<rightLength;i++){
            rightarray[i] = nums[mid+i+1];
        }

        int i = 0 ;
        int j = 0 ;
        int k = low ;

        while(i<leftarray.length && j<rightarray.length){
            if(leftarray[i]<rightarray[j]){
                nums[k] = leftarray[i];
                i++;
                k++;
            }
            if(leftarray[i]>rightarray[j]){
                nums[k] = rightarray[j];
                j++;
                k++;
            }
        }
//        while(i)
    }

    public static void main(String[] args) {

    }
}
