public class G_diagonalSum {
    public static void diagonalSum(int arr[][]) {
        int LeftDiagSum=0;
        int mainDiagSum=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         if(i+j==arr.length-1){  
        //             LeftDiagSum +=arr[i][j];
        //         }
        //         if(i==j){
        //             mainDiagSum +=arr[i][j];
        //         }
        //     }
        // }
        for(int i=0;i<arr.length;i++){
            mainDiagSum+=arr[i][i];     //i==j
            if(i!=arr.length-1-i){     //i!=j
            LeftDiagSum +=arr[i][arr.length-1-i];   // i+j=n-1
            }            
        }
        
        System.out.println("Left Diagnol Sum is "+LeftDiagSum);

        System.out.println("Main Diagnol Sum is "+mainDiagSum);

        System.out.println("Sum of All Diagnol is "+ (LeftDiagSum+mainDiagSum));
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        diagonalSum(arr);
    }
}
