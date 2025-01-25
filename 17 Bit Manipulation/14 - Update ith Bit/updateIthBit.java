

public class updateIthBit {
    public static int ClearIthBitMethod(int n,int i) {
        int k=~(1<<i);
        return (n & k);
    }
    public static int SetIthBitMethod(int n,int i) {
        int k=1<<i;
        return (n | k);
    }
    public static int updateIthBitMethod(int n,int i,int NewBit){
        if(NewBit==0){
           return ClearIthBitMethod(n, i);
        }
        else{
           return SetIthBitMethod(n, i);
        }
    }

    public static void main(String[] args) {
        System.out.println(updateIthBitMethod(10, 2, 1));
    }
}
