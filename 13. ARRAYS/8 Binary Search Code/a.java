class solution1{
    public static int BinarySearch(int arr[],int target){
        int high=arr.length-1;
        int low=0;
        for(int i=0;i<arr.length;i++){
            int mid=high-(high -low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}


public class a {
    public static void main(String[] args) {
        int arr[]={1,5,7,9,33,65};
        int target=65;
        System.out.print(solution1.BinarySearch(arr, target));
    }
}
