public class b {
    public static void countNumber(int arr[][],int Number) {
        int fre=0;
        int Row=0;
        int Col=arr[0].length-1;
        while (Row<arr.length && Col>=0) { 
            if(arr[Row][Col]==Number){
                fre++;
                Col--;
            }
            else if(arr[Row][Col]<Number){
                Row++;
            }
            else{
                Col--;
            }
        }
        System.out.println(Number +" Find Out "+fre +" Times");
    }
    public static void main(String[] args) {
        int arr[][]={{4,7,8},{8,8,9},{10,11,12}};
        countNumber(arr, 8);
    }
}

