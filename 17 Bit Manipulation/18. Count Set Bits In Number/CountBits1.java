public interface CountBits1 {
    public static int CountBits(int n) {
        int count=0;
        
        for(int i=n;i>0;i--){
            if((n & 1) !=0){
                count ++;
            }
            n=n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(CountBits(9));
    }
}