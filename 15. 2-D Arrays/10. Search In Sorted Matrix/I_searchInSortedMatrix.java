public class I_searchInSortedMatrix {
    public static void searchInSortedMatrix(int arr[][],int target) {
        int Row=0,Column=arr[0].length-1;
        int i=-1;
        int j=-1;
        while (Row<arr.length && Column>=0) { 
            if(arr[Row][Column]==target){
                i=Row;
                j=Column;
                break;
            }
            else if(arr[Row][Column]<target){
                Row++;
            }
            else{
                Column--;
            }
        }
        if(i!=-1 && j !=-1){
            System.out.println("The Number Found at Row and Column "+ i +" , "+j);
            }
        else{
                System.out.println("The Number not Found in Array ");
            }

    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        searchInSortedMatrix(arr, 13);
    }
}
