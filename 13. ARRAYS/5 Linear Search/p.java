public class p{
    public static int LinearSearch(int arr[],int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[]={1,5,9,66,76,45};
        int targeValue=76;
        int index=LinearSearch(array, targeValue);
        if(index!=-1){
            System.out.println("Number "+targeValue+ " found in index "+index);
        }
        else{
            System.out.println("Number is not found");
        }
    }
}