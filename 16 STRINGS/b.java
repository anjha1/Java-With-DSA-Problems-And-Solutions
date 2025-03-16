public class b {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("");
        for(char i='a';i<='z';i++){
            str=str.append(i);
        }
        System.out.println(str);
    }
}
