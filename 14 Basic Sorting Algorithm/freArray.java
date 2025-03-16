import java.util.Arrays;

public class freArray {
    public static void frequencyArray(int arr[]) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int frearr[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            frearr[arr[i]]++;
        }
        int j=0;
        
        for(int i=0;i<frearr.length;i++){
            while (frearr[i]>0) {
                arr[j]=i;
                j++;
                frearr[i]--;
            }
            // for (; frearr[i] > 0; frearr[i]--) {  
            //     arr[j] = i;  
            //     j++;  
            // }
            
        }

        printArray(arr);
    }
    
    public static void printArray(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={1,8,7,5,8,3,9,1,1,7,5,5,5,5,5};
        frequencyArray(arr);
    }
}
