import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblemUsingStack {
    public static void StockSpan(int Stock []) {
        int Span[]=new int[Stock.length];

        Stack<Integer> s=new Stack<>();
        Span[0]=1;
        s.push(0);
        for(int i=1;i<Stock.length;i++){
            while (!s.isEmpty() && Stock[s.peek()]<Stock[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                Span[i]=i+1;
            }
            else{
            int prevHist=s.peek();
            Span[i]=i-prevHist;
            }

            s.push(i);
        }
        System.out.println(Arrays.toString(Span));
    }
    public static void main(String[] args) {
        int arr[]={100,80,60,70,60,85,100};
        StockSpan(arr);
    }
}
