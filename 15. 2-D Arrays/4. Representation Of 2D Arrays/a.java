public class a {
    public static void countNumber(int arr[][],int Number) {
        int fre=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==Number){
                    fre++;
                }
            }
        }
        System.out.println(Number +" Find Out "+fre +" Times");
    }
    public static void main(String[] args) {
        int arr[][]={{4,7,8},{8,8,7}};
        countNumber(arr, 7);
    }
}
