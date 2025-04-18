import java.util.Stack;

public class ValidParentheses {
    public static Boolean isValidParentheses(String str) {

        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);

            if(c=='(' || c=='{' || c=='['){
                s.push(c);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek()=='(' && c==')' || s.peek()=='{' && c=='}' ||  s.peek()=='[' && c==']'){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str="({[]()})";
        System.out.println(isValidParentheses(str));;
    }
}
