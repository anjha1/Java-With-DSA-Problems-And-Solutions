

public class SetIthBit {
    public static int SetIthBitMethod(int n,int i) {
        int k=1<<i;
        return (n | k);
    }
    public static void main(String[] args) {
        System.out.println(SetIthBitMethod(10,2));
    }
}
