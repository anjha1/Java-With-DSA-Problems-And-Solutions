import java.util.Arrays;

public class B_selectionSort {
    public static void selectionSort(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        printArray(arr);
    }
    public static void printArray(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,8,2,9};
        selectionSort(arr);
    }
}
