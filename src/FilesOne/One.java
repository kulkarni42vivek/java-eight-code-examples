package FilesOne;
import java.util.*;

public class One {
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int max = 0 ;
        int localMax = 0 ;
        for(int i = 1 ;i< nums.length ;i++){
            if(nums[i] == nums[i-1] +1){
                localMax++;
            }
            else{
                max = Math.max(localMax , max);
                localMax = 0;
            }
        }
        if(nums[nums.length-1] == nums[nums.length-2]){
            max = Math.max(localMax , max);
        }
        return max;
    }


    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static List<Integer> majorityElementTwo(int[] nums) {
        Map<Integer , Integer> hmap  = new HashMap<>();
        List<Integer> answer  = new ArrayList<>();
        for(int i = 0 ;i<nums.length;i++){
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0)+1);
            if(hmap.get(nums[i]) > nums.length/3){
                answer.add(nums[i]);
            }
        }
        return answer;
    }

    public static int subarraySum(int[] nums, int k) {
        int windowLength =  nums.length;
        int maxLength  = 0 ;
        for(int i = 1 ;i <= windowLength ; i++){
            int localWindowSum  = 0 ;
            for(int j = 0 ;j<i ; j++){
                localWindowSum += nums[j];
            }
            if(k == localWindowSum){
                maxLength =i;
            }
            for(int j = 1;j<=windowLength-i;j++){
                localWindowSum = localWindowSum + nums[i+j-1] - nums[j-1];
                if(localWindowSum == k){
                    maxLength =i;
                }
            }
        }
        return maxLength;
    }

    public static int[] getFloorAndCeil(int[] nums, int x) {
        int start = 0 ; int answer  = 0;
        int end =  nums.length-1;
        while(start<end){
            int mid = (start + end)/2;
            if(nums[mid] >= x){
                answer = nums[mid];
                end = mid-1;
            }
            else{
                start  = mid+1;
            }
        }
        int[] values  = new int[]{0,1};
        return values;
    }

    public static void main(String[] args) {
        getFloorAndCeil(new int[]{3, 4, 4, 7, 8, 10} , 5);

    }
}
