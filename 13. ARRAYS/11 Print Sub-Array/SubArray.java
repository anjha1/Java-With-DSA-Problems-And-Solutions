import java.util.*;

public class SubArray {
    public static void PrintSubArray(int arr[]) {
        int p = 0; 
        for (int i = 0; i < arr.length; i++) { 
            for (int j = i; j < arr.length; j++) { 
                for (int k = i; k <= j; k++) { 
                    System.out.print(arr[k] + " ");
                }
                System.out.println(); 
                p++; 
            }
        }
        System.out.println("Total number of subarrays is " + p);
    }

    public static void main(String[] args) {
        int Array[] = {2, 4, 6, 8, 10};
        PrintSubArray(Array);
    }
}
