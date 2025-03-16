public class H_searchInSortedMatrix {
    public static void searchInSortedMatrix(int arr[][],int target) {
        int Row=-1;
        int Column=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==target){
                    Row=i;
                    Column=j;
                    break;
                }
            }
        }
        if(Row !=-1 && Column !=-1){
        System.out.println("The Number Found at Row and Column "+ Row +" , "+Column);
        }
        else{
            System.out.println("The Number not Found in Array ");
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        searchInSortedMatrix(arr, 3);
    }
}
