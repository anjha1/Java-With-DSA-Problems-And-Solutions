public class MaxSubArraySum { 
    public static void maxsum(int arr[]) {
        int arr1[] = new int[arr.length];
        arr1[0] = arr[0];
        
       
        for (int i = 1; i < arr.length; i++) {
            arr1[i] = arr1[i - 1] + arr[i];
        }
        
        int maxsum = Integer.MIN_VALUE;
        
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
           
                int sum = i == 0 ? arr1[j] : arr1[j] - arr1[i - 1];
                
                if (sum > maxsum) {
                    maxsum = sum;
                }
            }
        }
        
        System.out.println("Maximum sum is " + maxsum);
    }
    
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        maxsum(arr);
    }
}
