public class E_spiralMatrix {
    public static void spiralMatrix(int arr[][]) {
        int startRow=0;
        int endRow=arr.length-1;
        int StartCol=0;
        int endCol=arr[0].length-1;

        while (StartCol<=endCol && startRow <= endRow) { 
            for(int i=StartCol;i<=endCol;i++){
                System.out.print(arr[startRow][i]+" ");
            }
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(arr[i][endCol]+" ");
            }
            for(int i=endCol-1;i>=StartCol;i--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(arr[endRow][i]+" ");
            }
            for(int i=endRow-1;i>startRow;i--){
                if(StartCol==endCol){
                    break;
                }
                System.out.print(arr[i][StartCol]+" ");
            }
        startRow++;
        StartCol++;
        endCol--;
        endRow--;
        }
        

    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        spiralMatrix(arr);
        
    }
}
