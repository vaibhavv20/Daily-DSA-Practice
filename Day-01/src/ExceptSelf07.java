public class ExceptSelf07 {
    public static void productExceptSelf(int[] arr) {
        int n = arr.length;
        int prefix[] = new int[n];
        int suffix [] = new int[n];
        prefix[0] = arr[0];
        suffix[n-1] = 1;
        for (int i = 1 ; i < arr.length ; i++){
            prefix[i] = prefix[i-1] * arr[i-1];
        }

        for (int i = n-2 ; i >= 0 ; i--){
            suffix[i] = suffix[i+1] * arr[i+1];
        }
        for (int i = 0 ; i < n ; i++){
            arr[i] = prefix[i] * suffix[i];
        }
        for (int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4};
        productExceptSelf(arr);
    }
}
