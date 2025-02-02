import java.util.*;

public class a {
    public static void main(String[] args) {
        ArrayList<Integer> k=new ArrayList<>();
        k.add(5);
        k.add(6);
        k.add(7);
        k.add(8);
        for(int i=0;i<k.size()/2;i++){
            int temp=k.get(i);
            k.set(i,k.get(k.size()-1-i));
            k.set((k.size()-1-i),temp );
        }
        System.out.print(k);
    }
}
