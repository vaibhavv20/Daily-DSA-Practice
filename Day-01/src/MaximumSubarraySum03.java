public class MaximumSubarraySum03 {
    public static int maxSum(int arr[]){
        if (arr.length == 0){
            System.out.println("Array is empty");
            return -1;
        }
        int bestSum = arr[0];
        int result = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            bestSum = Math.max(bestSum+arr[i], arr[i]);
            result = Math.max(result, bestSum);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,-9,6,4,-4,8};
        System.out.println("Maximum Sum is: "+maxSum(arr));
    }
}
