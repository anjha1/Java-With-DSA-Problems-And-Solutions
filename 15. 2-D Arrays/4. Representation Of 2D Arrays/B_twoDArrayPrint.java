import java.util.Arrays;

public class B_twoDArrayPrint {
    public static void printArray(int arr[][]) {
        System.out.println(Arrays.deepToString(arr));
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9},{8,9,5}};
        printArray(arr);
        
    }
}
