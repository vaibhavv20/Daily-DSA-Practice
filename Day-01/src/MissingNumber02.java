public class MissingNumber02 {
    public static int missingNumber(int[] arr) {
        int sum = 0 ;
        for(int i = 0 ; i <= arr.length ; i++){
            sum += i;
        }
        int newSum = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            newSum += arr[i];
        }
        return sum-newSum;
    }

    public static void main(String[] args) {
        int arr[] = {3,0,1};
        System.out.println(missingNumber(arr));
    }
}
