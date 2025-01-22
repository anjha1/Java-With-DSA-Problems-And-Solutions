import java.util.*;

public class Pairs {
    public static void PairsOfElement(int arr[]){
        int p=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+" "+arr[j]+")");
                p=p+1;
            }
            System.out.println("");
        }
        System.out.println("Total number of pair is "+p);
    }
    public static void main(String[] args) {
        int Array[]={2,4,6,8,10};
        PairsOfElement(Array);
    }
}
