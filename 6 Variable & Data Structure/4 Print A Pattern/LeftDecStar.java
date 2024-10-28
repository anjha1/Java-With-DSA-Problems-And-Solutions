/*
           * * * * *
           * * * *
           * * *
           * *
           * 
 
 */

class Solution{
    public void Pattern(int n){
        for (int line =0; line < n;line++) {
            for(int star=0;star<n-line;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
public class LeftDecStar {
    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.Pattern(5);
    }
}

