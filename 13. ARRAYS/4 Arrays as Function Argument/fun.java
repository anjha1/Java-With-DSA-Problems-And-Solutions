
public class fun {
    public static void update(int arr[]){
        for(int k=0;k<arr.length;k++){
            arr[k]=arr[k]+1;
        }
    }
    public static void main(String[] args) {
        int arr []={1,5,9};
        update(arr);
        for(int t:arr){
            System.out.print(t+" ");
        }
    }
}
