import java.util.*;
public class ThreeSum04 {
    public static void threeSum(int arr[]){
        int target = 0 ;
        for (int i = 0 ; i < arr.length-2 ; i++){
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            int start = i+1;
            int end = arr.length-1;
            while (start < end){
                int sum = arr[i]+arr[start]+arr[end];
                if (sum == target){
                    System.out.println(arr[i]+" "+arr[start]+" "+arr[end]);
                    int left = arr[start];
                    int right = arr[end];
                    while (start < end && left == arr[start]) start++;
                    while (start < end && right == arr[end]) end--;
                }
                else if (sum > target){
                    end--;
                }
                else {
                    start++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        Arrays.sort(arr);
        threeSum(arr);
    }
}
