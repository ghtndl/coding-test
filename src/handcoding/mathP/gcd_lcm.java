package handcoding.mathP;

public class gcd_lcm {
    public static void main(String[] args) {
        int a = 60;
        int b = 36;
        int gcdresult = gcd(a, b);
        System.out.println(gcdresult);

        int lcmresult = lcm(a, b);
        System.out.println(lcmresult);
    }
    private static int gcd(int a, int b) {
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
