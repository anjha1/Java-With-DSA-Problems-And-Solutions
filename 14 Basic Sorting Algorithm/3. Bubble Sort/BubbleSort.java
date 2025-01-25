public class BubbleSort {
    public static void BubbleSortArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void printArray(int arr[]) {
        for(int i:arr){
            System.out.print(i);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        BubbleSortArray(arr);
        printArray(arr);
    }
}
