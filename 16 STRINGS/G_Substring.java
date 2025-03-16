public class G_Substring {
    public static void Substring(String sc,int start,int end) {
        sc=sc.replace(" ", "");
        for(int j=start;j<end;j++){
            System.out.print(sc.charAt(j));
        }
        System.out.println();
        return;
    }
    public static void main(String[] args) {
        String sc="Hello World";
        Substring(sc,4,6);
    }
}
