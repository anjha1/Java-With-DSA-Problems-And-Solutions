class Solution1{
    public void StarPrint(int n){
        for(int line=1;line<=n;line++){
            for(int star=1;star<=line;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class RightDecStar {
    public static void main(String[] args) {
        Solution1 obj=new Solution1();
        obj.StarPrint(5);
    }
}
