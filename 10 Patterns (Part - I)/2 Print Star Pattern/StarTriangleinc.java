import java.util.*;
import java.io.*;
class Solution1{
    public void LeftIncreasingOrder(int num){
        for(int line=1;line<=num;line++){
            for(int star=1;star<=line;star++){
                if(line+star==num){
                    System.out.print("* ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    public void RightIncreasingOrder(int num){
        for(int line=1;line<=num;line++){
            for(int star=1;star<=line;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

   
}


public class StarTriangleinc {
    public static void main(String[] args) {
        Solution1 obj=new Solution1();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        int x=sc.nextInt();
        obj.LeftIncreasingOrder(x);
    }
    
}


