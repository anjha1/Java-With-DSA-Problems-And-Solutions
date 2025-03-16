import java.util.Arrays;

public class A_BubbleSort {
    public static void bubbleSort(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
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
        bubbleSort(arr);
    }
}