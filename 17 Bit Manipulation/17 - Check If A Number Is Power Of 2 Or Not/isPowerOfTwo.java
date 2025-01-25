

public class isPowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return (n>0 && (n & (n-1))==0);  
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(7));
    }
}
// 0111     1000
// 0110     0111
// 0110     0000