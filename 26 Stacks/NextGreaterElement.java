import java.util.Arrays;

public class NextGreaterElement {
    public static void nextGreaterElement(int arr[]) {
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i<arr.length-1 && arr[i]<arr[i+1]){
                arr1[i]=arr[i+1];
            }
            else{
                arr1[i]=-1;
            }
        }

        System.out.println(Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        nextGreaterElement(arr);
    }
}
