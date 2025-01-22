class solution{
    public static void MaxOfSubArraySum(int arr[]) {
        
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum =sum+arr[k];
                }
                System.out.print("(current sum is "+sum+" )");
                if(sum>maxsum){
                    maxsum=sum;
                }
                System.out.println("");
                
            }
            System.out.println("");
        }
        System.out.println("maxsum "+maxsum);
    }
}



public class MaxSubArraySum {
    public static void main(String[] args) {
        int Array[] = {1,-2,6,-1,3};
        solution.MaxOfSubArraySum(Array);
    }
}
