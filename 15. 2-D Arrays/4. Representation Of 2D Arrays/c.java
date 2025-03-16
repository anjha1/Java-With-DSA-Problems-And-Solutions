
import java.util.Scanner;

public class c {
    public static void sumOfSeconRow(int arr[][]) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter which row of sum do you want ");
        int a=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            sum +=arr[a][i];
        }
        System.out.println("Sum is "+sum);
    }
    public static void main(String[] args) {
        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
        sumOfSeconRow(arr);
    }
}
