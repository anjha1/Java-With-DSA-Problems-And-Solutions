

public class GetIthBit {
    public static int GetingIthBit(int n,int i) {
        int k=1<<i;
        if((n & k)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
   public static void main(String[] args) {
    System.out.println(GetingIthBit(10, 2));
   } 
}
