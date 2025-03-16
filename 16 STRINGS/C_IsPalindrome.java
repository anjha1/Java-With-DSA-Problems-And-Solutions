public class C_IsPalindrome {
    public static Boolean  IsPalindrome(String a) {
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(i)!=a.charAt(a.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String sc="anjna";
        System.out.println(IsPalindrome(sc));
    }
}
