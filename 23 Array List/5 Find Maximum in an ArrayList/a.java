import java.util.*;

public class a {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(9);
        arr.add(3);
        arr.add(6);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++){
            if(max<arr.get(i)){
                max=arr.get(i);
            }
        }
        System.out.println("Maximum number is "+max);
    }
}
