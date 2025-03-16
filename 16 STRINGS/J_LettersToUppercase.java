
public class J_LettersToUppercase {
    public static void LettersToUppercase(String sc) {
        char arr[]=sc.toCharArray();
        if(arr[0]>97 && arr[0]<122){
            char ch1=arr[0];
            int ascii1 = (int) ch1-32;
            arr[0] = (char) ascii1;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==' ' && arr[i+1]>97 && arr[i+1]<122){
                char ch=arr[i+1];
                int ascii = (int) ch-32;
                arr[i+1] = (char) ascii;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : arr) {
            sb.append(ch);  
        }
        
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String sc="I love my India";
        LettersToUppercase(sc);
    }
}
