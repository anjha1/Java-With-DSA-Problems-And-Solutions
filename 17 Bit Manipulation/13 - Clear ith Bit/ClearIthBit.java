

public class ClearIthBit {
    public static int ClearIthBitMethod(int n,int i) {
        int k=~(1<<i);
        return (n & k);
    }
    public static void main(String[] args) {
        System.out.println(ClearIthBitMethod(10,1));
    }
}
