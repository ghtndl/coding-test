package codingtest.swea;

import java.util.Scanner;

public class D3P1206 {
    public static void main(String[] args) {
        int T = 10;
        for (int i = 0; i < T; i++) {

            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int j = 0; j < N; j++) {
                A[j] = sc.nextInt();
            }
            int result = 0;
            for (int j = 2; j < N-2; j++){
                result += Math.max(0,A[j]-Math.max(Math.max(A[j-2],A[j-1]),Math.max(A[j+1],A[j+2])));
            }
            System.out.println("#" + 1 + " " + result);
        }
    }
}

