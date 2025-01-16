class solution{
    public static void LinearSearchArray(int arr[],int target){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
             
            }
        }
        if(index!=-1){
            System.out.print("Element found at "+index);
        }
        else{
            System.out.print("Element not found in array");
        }
    }
}

public class LinearSearch {
    public static void main(String[] args) {
        solution obj=new solution();
        int arr[]={4,8,5,6,9};
        obj.LinearSearchArray(arr,5);
    }
}
