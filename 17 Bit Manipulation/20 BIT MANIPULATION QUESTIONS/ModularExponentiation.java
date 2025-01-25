public class ModularExponentiation {
    public static int ModularExponentiation(int a,int n,int c) {
        int ans=1;
        for(int i=n;i>0;i--){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return (ans % c);
    }
    public static void main(String[] args) {
        System.out.println(ModularExponentiation(2, 5, 13));
    }
}
