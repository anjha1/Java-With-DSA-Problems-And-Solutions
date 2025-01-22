import java.util.*;

class Solution {
    public static void inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("");
        System.out.print("Enter the Numbers Present in Array, separated by Space: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = FindLargestNumber(arr);
        System.out.println("");
        System.out.print("Largest Number in Array " + Arrays.toString(arr) + " is " + max);
        sc.close();
    }

    public static int FindLargestNumber(int array[]) {
        int max = Integer.MIN_VALUE; // Use a very small value as the initial max
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

public class LargestNumber {
    public static void main(String[] args) {
        Solution.inputArray();
    }
}
