public class E_ShortestPath {
    public static void ShortestPath(String sc) {
        int E=0;
        int W=0;
        int N=0;
        int S=0;
        char arr[]=sc.toCharArray();
        for(int i=0;i<sc.length();i++){
            if(arr[i]=='E'){
                E++;
            }
            if(arr[i]=='W'){
                W--;
            }
            if(arr[i]=='N'){
                N++;
            }
            if(arr[i]=='S'){
                S--;
            }
        }
        int x=W+E;
        int y=N+S;
        int z=x*x+y*y;
        Double D=Math.sqrt(z);

        System.out.println("Min Displacement is "+D);
    }
    public static void main(String[] args) {
        String sc="WNEENESENNN";
        ShortestPath(sc);
    }
   
}
 