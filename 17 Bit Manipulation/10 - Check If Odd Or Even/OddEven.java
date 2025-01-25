public class OddEven {
    public static void CheckOddEven(int n) {
        int k=1;
        if((n & k)==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
    public static void main(String[] args) {
        CheckOddEven(5);
        CheckOddEven(6);
    }
}