import java.util.*;
public class NextGreaterElementRightStack {
    public static void nextGreaterElement(int arr[]) {
        Stack<Integer> s=new Stack<>();
        int arr1[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = -1;
        }

        for(int i=arr.length-1;i>=0;i--){
            while (!s.isEmpty() && arr[i]>=arr[s.peek()]) {
                s.pop();
            }
            // int nextgra=s.peek();
            if(!s.isEmpty()){
                arr1[i]=arr[s.peek()];
            }
            s.push(i);
        }
        System.out.println(Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 25};

        nextGreaterElement(arr);
    }
}
