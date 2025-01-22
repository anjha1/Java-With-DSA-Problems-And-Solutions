import java.util.*;
public class Reverse {
    public static void ReverseArray(int arr[]){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
    public static void PrintArray(int arr[]){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int array[]={1,3,5,7,9};
        ReverseArray(array);
        PrintArray(array);
    }
}
