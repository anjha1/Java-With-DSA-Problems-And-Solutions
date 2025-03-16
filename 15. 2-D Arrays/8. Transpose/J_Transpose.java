import java.util.Arrays;

public class J_Transpose {
    public static void Transpose(int arr[][]) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        printArray(arr);
    }
    public static void printArray(int arr[][]) {
        for(int i[]:arr){
            System.out.println(Arrays.toString(i));
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        printArray(arr);
        System.out.println();
        System.out.println("Transpose of Matrix is ");
        System.out.println();
        Transpose(arr);
    }
}
