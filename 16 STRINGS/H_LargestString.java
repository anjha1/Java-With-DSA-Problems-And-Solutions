public class H_LargestString {
    public static String LargestString(String arr[]) {
        String largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(largest.compareTo(arr[i])<0){
                largest=arr[i];
            }
        }
        return largest;
        
    }
    public static void main(String[] args) {
        String arr[]={"apple","mango","banana"};
        System.out.println(LargestString(arr));
    }
}
