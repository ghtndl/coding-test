package handcoding.fibonacciP;

public class fibonacciMemo {
    public static void main(String[] args) {
        int result = solution(5);
        System.out.println(result);
}
private static int solution(int n) {
        int[] memo = new int[n + 1];
        return fibo(n, memo);
}
private static int fibo(int n, int[] memo) {
        if(memo[n] != 0) {
            return memo[n];
        }
        if(n < 2){
            return n;
        }
        return memo[n] = fibo(n - 1, memo) + fibo(n - 2, memo);
}
}
