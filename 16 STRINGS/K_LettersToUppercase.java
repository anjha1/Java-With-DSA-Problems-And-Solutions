public class K_LettersToUppercase {
    public static  String  LettersToUppercase(String sc) {
        StringBuilder str=new StringBuilder("");
        char ch=Character.toUpperCase(sc.charAt(0));
        str.append(ch);
        for(int i=1;i<sc.length();i++){
            if(sc.charAt(i)== ' ' ){
                str.append(sc.charAt(i));
                i++;
                str.append(Character.toUpperCase(sc.charAt(i)));
            }
            else{
                str.append(sc.charAt(i));
            }
        }
        return str.toString();

    }
    public static void main(String[] args) {
        String sc="I love my India";
        System.out.println(LettersToUppercase(sc));
    }
}
