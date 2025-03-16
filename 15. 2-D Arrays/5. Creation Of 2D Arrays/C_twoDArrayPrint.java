public class C_twoDArrayPrint {
    public static void printArray(int arr[][]) {
        for(int i[]:arr){
            for(int j:i){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9},{8,9,5}};
        printArray(arr);
    }
}
