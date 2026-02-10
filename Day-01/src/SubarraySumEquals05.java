import java.util.*;
public class SubarraySumEquals05 {
    public static void subarraysSum(int arr[] , int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0 ;
        int start = 0 ;
        int count = 0 ;
        while(start<arr.length){
            sum += arr[start];
            int req = sum - target;
            count += map.getOrDefault(req,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
            start++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1};
        int target = 2;
        subarraysSum(arr , target);
    }
}
