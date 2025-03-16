public class I_StringBuilder {
    public static void main(String[] args) {
        String sc="";
        StringBuilder str=new StringBuilder("");
        for(char i='a';i<='z';i++){
            sc +=i;
            // the time complexity is O(n^2) due to string concatenation, 
            // and the space complexity is O(n) for the final string.
            str=str.append(i);

            // the overall time complexity of the loop is O(26), 
            // which simplifies to O(1) since it is a constant time operation
            // In summary, the time complexity is O(1) and the space 
            // complexity is O(1) for this specific implementation, 
            // as both are constant due to the fixed number of iterations and characters.
        }
        System.out.println(sc);
        System.out.println(str);
    }
}
