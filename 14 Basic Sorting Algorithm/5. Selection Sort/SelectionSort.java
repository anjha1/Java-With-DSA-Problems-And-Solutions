public class SelectionSort {

    public static void SelectionSortArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;
        }
        
    }
    public static void printArray(int arr[]) {
        for(int i:arr){
            System.out.print(i);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        SelectionSortArray(arr);
        printArray(arr);
    }
}
