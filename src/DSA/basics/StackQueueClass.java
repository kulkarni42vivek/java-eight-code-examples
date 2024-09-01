package DSA.basics;
import java.util.*;

public class StackQueueClass {
    public static void main(String[] args) {
        kadanes(new int[]{-2,-3,-7,-2,-10,-4});
    }

    private static int kadanes(int[] nums) {
        int answer = Integer.MIN_VALUE;
        int maxWindowLegth = nums.length ;
        for(int i = 1 ;i<maxWindowLegth;i++) {
            int localWindowLen = i;
            int windowSum = 0;
            for (int j = 0; j < localWindowLen; j++) {
                windowSum = windowSum + nums[j];
            }
            answer = Math.max(windowSum, answer);
            for (int k = localWindowLen; k < nums.length; k++) {
                windowSum = windowSum + nums[k] - nums[k - localWindowLen];
                answer = Math.max(windowSum, answer);
            }
        }
        return answer;
    }
}
