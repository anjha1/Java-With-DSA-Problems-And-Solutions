class solution{
    public static void MaxSubArraySum(int arr[]) {
        int currentSum=0;
        int sum=0;
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            if(currentSum<0){
                currentSum=0;
            }
            if(currentSum>MaxSum){
                MaxSum=currentSum;
            }
        }
        System.out.println("Maximum sum is "+MaxSum);
    }
}



public class a {
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        int arr1[]={-2,-3,4,-1,-2,1,5,-3};
        solution.MaxSubArraySum(arr1);
    }
}
