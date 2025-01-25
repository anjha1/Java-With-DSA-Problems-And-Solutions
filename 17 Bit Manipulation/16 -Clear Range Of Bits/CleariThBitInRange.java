

public class CleariThBitInRange {
    public static int  CleariThBitInRange(int n,int i,int j){
        int a=(-1) << j+1;     // -1==~0
        int b=~((-1) << i);   // int b= (1<< i)-1
        int k= a | b;
        return n & k ;
    }
    public static void main(String[] args) {
        System.out.println(CleariThBitInRange(10, 2, 4));
    }
}
