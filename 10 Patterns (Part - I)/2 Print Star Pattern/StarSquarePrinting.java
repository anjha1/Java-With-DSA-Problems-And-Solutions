import java.util.*;
import java.io.*;
class Solution{
    public void SquarePattern(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


public class StarSquarePrinting {
    public static void main(String[] args) {
        Solution obj=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        int x=sc.nextInt();
        obj.SquarePattern(x);
    }
    
}
