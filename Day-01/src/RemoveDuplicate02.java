public class RemoveDuplicate02 {
    public static void removeDuplicate(int arr[]){
        int index = 0 ;
        for (int i = 0 ; i < arr.length-1 ; i++){
            if (arr[i] != arr[i+1]){
                arr[index++] = arr[i];
            }
        }
        arr[index++]  = arr[arr.length-1];
        for (int i = 0 ; i < index ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3,3,3,3,4,5,5,5,6};
        removeDuplicate(arr);
    }
}
