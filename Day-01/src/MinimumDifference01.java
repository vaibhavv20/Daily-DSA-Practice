import java.util.Arrays;

public class MinimumDifference01 {
    public static int minimumDifference(int[] nums , int k ) {
        int minDiff = Integer.MAX_VALUE;
        if(nums.length == 1){
            return 0;
        }
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length-k; i++){
            int diff = nums[i+k-1] -  nums[i];
            if(diff < minDiff){
                minDiff = diff;
            }
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int arr[] = {9,4,1,7};
        int k = 2;
        System.out.println(minimumDifference(arr, 2));
    }
}
