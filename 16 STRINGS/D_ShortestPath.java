public class D_ShortestPath {
    public static float  ShortestPath(String sc) {
        int x=0;
        int y=0;
        for(int i=0;i<sc.length();i++){
            if(sc.charAt(i)=='E'){
                x++;
            }
            else if(sc.charAt(i)=='W'){
                x--;
            }
            else if(sc.charAt(i)=='N'){
                y++;
            }
            else if(sc.charAt(i)=='S'){
                y--;
            }
        }
        int z=x*x+y*y;
        return (float) Math.sqrt(z);

        //System.out.println("Min Displacement is "+D);
    }
    public static void main(String[] args) {
        String sc="WNEENESENNN";
        System.out.println(ShortestPath(sc));
    }
}
