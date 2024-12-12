package codingtest.swea;

import java.util.Scanner;

public class D2P1859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T  = sc.nextInt();  //test case
        for(int tc = 1; tc <= T; tc++) {

            int N = sc.nextInt();
            int[] a = new int[N];
            int max = 0;
            long profit = 0;

            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }

            for(int j = N-1; j >= 0; j--) {
                if(a[j] > max) max = a[j];
                profit += max - a[j];
            }

            System.out.println("#"+tc+" "+profit);
        }
        sc.close();
    }
}
