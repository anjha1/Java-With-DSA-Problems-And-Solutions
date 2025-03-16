public class L_SrringCompression {
    public static String SrringCompression(String sc) {
        StringBuilder str=new StringBuilder();
        int count=1;
        for(int i=0;i<sc.length();i++){
            if(i<sc.length()-1 && sc.charAt(i)==sc.charAt(i+1)){
                count++;
            }

            else{
                str.append(sc.charAt(i));
                if(count>1){
                    str.append(count);
                }
                count=1;
            }
        }
        
        
        return str.toString();
    }
    public static void main(String[] args) {
        String sc="aaabbcccdd";
        System.out.println(SrringCompression(sc));
    }
}
