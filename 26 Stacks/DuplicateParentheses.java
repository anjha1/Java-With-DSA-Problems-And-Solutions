import java.util.Stack;

public class DuplicateParentheses {

    public static boolean isDuplicateParentheses(String str) {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==')'){
                int count=0;
                while (s.peek()!='(') {
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
                else{
                    s.pop();
                }
            }
            else{
                s.push(c);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String st="((a+b))";
        String st1="(a-b)";
        System.out.println(isDuplicateParentheses(st));
    }
}
