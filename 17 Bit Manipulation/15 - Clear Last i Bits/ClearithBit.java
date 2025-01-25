

public class ClearithBit {
    public static int ClearIthBitMethod(int n,int i) {
        int k=(-1)<<i;
        return (n & k);
    }
    public static void main(String[] args) {
        System.out.println(ClearIthBitMethod(15, 2));
    }
}
