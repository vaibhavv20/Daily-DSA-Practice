import javax.sound.midi.SysexMessage;

public class BookReader08 {
    public static void bookReader(int arr[]){
        int time = 5;
        int start = 0;
        int end = 0 ;
        int sum = 0 ;
        int maxLen = 0;
        while (end < arr.length){
            sum += arr[end];
            while (sum > time){
                sum -= arr[start];
                start++;
            }
            int len = end - start + 1;
            maxLen = Math.max(maxLen,len);

            end++;
        }
        System.out.println(maxLen);
    }

    public static void main(String[] args) {
        int arr[] = {3,1,2,1};
        bookReader(arr);
    }
}
