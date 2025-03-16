
import java.util.Arrays;
import java.util.Scanner;

public class D_inputTwoDArray {
    public static void inputTwoDArray() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the no of Row : ");
        int a=sc.nextInt();
        System.out.println();
        System.out.print("Please Enter the no of Column : ");
        int b=sc.nextInt();
        int arr[][]=new int[a][b];

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printArray(arr);

    }
    public static void printArray(int arr[][]) {
        System.out.println(Arrays.deepToString(arr));
    }
    public static void main(String[] args) {
        inputTwoDArray();
    }
}
