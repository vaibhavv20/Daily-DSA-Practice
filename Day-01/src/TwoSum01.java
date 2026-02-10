import java.util.*;
public class TwoSum01 {
    public static void twoSum(int arr[] , int target) {
        if (arr.length == 0 ){
            System.out.println("Arrays is Empty: ");
            return;
        }
        int n= arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for (int i = 0 ; i < n ; i++) {
            int key = arr[i];
            int req = target - key;
            if (map.containsKey(req)) {
                System.out.println("Indexes are: "+map.get(req)+" "+i);
                return;
            }
            map.put(key,i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,0,7,8,5};
        int target = 9;
        twoSum(arr, target);
    }
}
