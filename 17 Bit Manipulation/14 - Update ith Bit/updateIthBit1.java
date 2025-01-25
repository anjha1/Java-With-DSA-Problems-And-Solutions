

public class updateIthBit1 {
    public static int ClearIthBitMethod(int n,int i) {
        int k=~(1<<i);
        return (n & k);
    }
    public static int updateIthBitMethod(int n,int i,int NewBit){
       n=ClearIthBitMethod(n,i);
       int k=NewBit<<i;
       return (n | k);
    }

    public static void main(String[] args) {
        System.out.println(updateIthBitMethod(10, 2, 1));
    }
}
