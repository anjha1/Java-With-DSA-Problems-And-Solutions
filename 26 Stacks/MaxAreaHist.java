public class MaxAreaHist {

    public static void MaxArea(int arr[]) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int k=1;
            for(int j=0;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    k=k*arr[i];
                }
                if(k>max){
                    max=k;
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int hight[]={2,1,5,6,2,3};
        MaxArea(hight);
    }
}
