
import java.util.*;
public class a {
    public static ArrayList<Integer> Swap(ArrayList<Integer> k,int idx1,int idx2){
        int temp=k.get(idx1);
        k.set(idx1,k.get(idx2));
        k.set(idx2,temp);
        // System.out.println(k);
        return k;

    }
    public static void main(String[] args) {
        ArrayList<Integer> k=new ArrayList<>();
        k.add(2);
        k.add(4);
        k.add(6);
        k.add(8);
        k.add(9);

        System.out.println(Swap(k,2,4));

    }
}
