class Solution{
    public int BinarySearchArray(int arr[],int target){
        int n=arr.length-1;
        int min=0;
        int max=n;
        int mid;
        for(int i=0;i<n;i++){
            mid=max-(max-min)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if (arr[mid]<target){
                min=mid+1;
            }
            else{
                max=mid-1;
            }
        }
        return -1;
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        Solution obj=new Solution();
        int array[]={1,3,7,9,16};
        int b=obj.BinarySearchArray(array, 99);
        if(b!=-1){
            System.out.println("Index foun at "+b);
        }
        else{
            System.out.println("Searched Element not found in an Array");
        }
        

    }
}
