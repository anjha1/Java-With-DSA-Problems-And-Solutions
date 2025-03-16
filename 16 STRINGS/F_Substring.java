public class F_Substring {
    public static String Substring(String sc,int start,int end) {
        //sc=sc.replace(" ", "");
        String str="";
        for(int i=start;i<end;i++){
            str +=sc.charAt(i);
        }
        return str;
    }
    public static void main(String[] args) {
        String sc="Hello World";
        System.out.println(sc.substring(4,6));
        System.out.println(Substring(sc,4,6));
    }
}
