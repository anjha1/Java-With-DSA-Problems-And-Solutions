import java.util.Arrays;

public class NextGreaterElementRight {
    public static void nextGreaterElement(int arr[]) {
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    arr1[i]=arr[j];
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        // int arr[]={6,8,0,1,3};
        int arr[] = {4, 5, 2, 25};

        nextGreaterElement(arr);
    }
}
