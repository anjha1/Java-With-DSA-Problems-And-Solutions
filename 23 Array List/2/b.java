import java.util.ArrayList;

public class b {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);

        
        System.out.println(a.get(2));
        System.out.println(a.remove(1));
        System.out.println(a);
        a.set(2,9);
        System.out.println(a);

    }
}
