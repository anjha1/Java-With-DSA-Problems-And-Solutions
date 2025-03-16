import java.util.Arrays;

public class sort1 {
    public static void printArray(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }
    public static void approach(int arr[]) {
        
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<arr.length;j++){
                if (arr[j] < min && (i != 0 ? arr[j] > arr1[i - 1] : true)) {
                    min = arr[j];
                }
                
            }
            arr1[i]=min;
        }
        printArray(arr1);
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        approach(arr);
    }
}
