import java.util.Arrays;

public class zigZag {

    public static void ZigZagArray(int arr[]) {
        System.out.println(Arrays.toString(arr));
        int arr1[]=new int[arr.length];
        int st=0;
        int end=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0 ){
                arr1[i]=arr[st];
                st++;
            }
            else{
                arr1[i]=arr[end];
                end--;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5};
        ZigZagArray(arr);

    }
}
