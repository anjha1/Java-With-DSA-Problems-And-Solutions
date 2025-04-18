import java.util.Arrays;

public class StockSpanProblem {

    public static void StockSpan(int arr[]) {
        int arr1[]=new int[arr.length];
        for(int curr=0;curr<arr.length;curr++){
            int t=1;
            for(int prev=curr-1;prev>=0;prev--){
                if(arr[prev]<arr[curr]){
                    t++;
                }
                else{
                    break;
                }
            }
            arr1[curr]=t;
        }
        arr1[arr1.length-1]+=1;
        System.out.println(Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        int arr[]={100,80,60,70,60,85,100};
        StockSpan(arr);
    }
}