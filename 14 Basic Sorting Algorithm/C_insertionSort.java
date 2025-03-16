import java.util.Arrays;

public class C_insertionSort {
    public static void insertionSort(int arr []) {
        for(int i=1;i<arr.length;i++){
            int cur=arr[i];
            int pre=i-1;
            while (pre>=0 && arr[pre]>cur) {
                arr[pre+1]=arr[pre];
                pre --;
            }
            arr[pre+1]=cur;
        }
        printArray(arr);
    }
     public static void printArray(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,8,2,9};
        insertionSort(arr);
    }
}
