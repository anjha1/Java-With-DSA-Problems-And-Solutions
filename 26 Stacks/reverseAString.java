// Reverse a String using a Stack
import java.util.*;
public class reverseAString {

    public static String reverse(String str) {
        Stack<Character> s=new Stack<>();
        int inx=0;
        while (inx<str.length()) {
            s.push(str.charAt(inx));
            inx++;
        }

        StringBuilder result=new StringBuilder("");
        while (!s.isEmpty()) {
            char top=s.pop();
            result.append(top);
        }

        return result.toString();
        
    }
    public static void main(String[] args) {
        reverseAString obj=new reverseAString();
        String a="anjha";
        System.out.print(obj.reverse(a));;
    }
}
