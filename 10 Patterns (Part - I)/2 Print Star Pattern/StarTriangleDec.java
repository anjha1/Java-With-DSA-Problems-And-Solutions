import java.util.*;
import java.io.*;
class Solution{
    public void DecreasingOrder(int num){
        for(int line=1;line<=num;line++){
            for(int star=num-line;star>=0;star--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


public class StarTriangleDec {
    public static void main(String[] args) {
        Solution obj=new Solution();
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the number ");
        // int x=sc.nextInt();
        obj.DecreasingOrder(6);
    }
    
}





