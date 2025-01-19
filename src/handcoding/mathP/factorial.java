package handcoding.mathP;

public class factorial {
    public static void main(String[] args) {
        int result = fact(5);
        System.out.println(result);
    }
    private static int fact(int n) {
        if(n == 1){
            return 1;
        }
        return n * fact(n-1);
    }
}
