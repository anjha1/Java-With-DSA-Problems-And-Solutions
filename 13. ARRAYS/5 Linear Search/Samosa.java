class solutionofSamosa{
    public static void SamosaSearch(String arr[],String food){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==food){
                index=i;
            }
        }
        if(index!=-1){
            System.out.print(food +" found at store number "+index);
        }
        else{
            System.out.print(food+" not found in store");
        }
    }
}

public class Samosa {
    public static void main(String[] args) {
        solutionofSamosa obj1Samosa=new solutionofSamosa();
        String arr[]={"curd","pani-puri","samosa","littiChokha","sandwich"};
        obj1Samosa.SamosaSearch(arr,"samosa");
    }
}