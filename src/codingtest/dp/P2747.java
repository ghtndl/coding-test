package codingtest.dp;

import java.util.Scanner;

public class P2747 {
    static int[] D;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        D = new int[N+1];
        for(int i=0; i<=N; i++){
            D[i] = -1;
        }
        D[0] = 0;
        D[1] = 1;
        System.out.println(fibonacci(N));
    }
    private static int fibonacci(int v){
        if(D[v] != -1) return D[v];
        return D[v] = fibonacci(v-1)+fibonacci(v-2);
    }
}
