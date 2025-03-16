import java.util.Arrays;

public class D_countingSort {
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
    
        int count[] = new int[largest + 1];
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
    
        int j = 0;
        for(int i = 0; i <count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        printArray(arr);
    }
    
     public static void printArray(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,8,2,9};
        countingSort(arr);
    }
}
