import java.util.*;

public class a {
   
    public static void main(String[] args) {
        
        ArrayList<Integer> a=new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        System.out.println(a.size());
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i));
        }
    }
}
