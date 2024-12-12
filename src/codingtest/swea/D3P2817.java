package codingtest.swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class D3P2817 {
    static int N, K, count;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc = 1; tc <= T; tc++) {
            N = sc.nextInt();
            K = sc.nextInt();
            arr = new int[N];
            for(int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            count = 0;
            dfs(0,0);

            System.out.println("#"+ tc+ " "+count);
        }
    }

    static void dfs(int idx, int sum) {
        if(idx == N) {
            if(sum == K) count++;
            return;
        }
            dfs(idx+1,sum);
            dfs(idx+1,sum+arr[idx]);
    }
}

