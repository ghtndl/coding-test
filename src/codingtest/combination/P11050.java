package codingtest.combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P11050 {
    static int N,K;
    static int D[][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        D = new int[N+1][N+1];

        for(int i = 0; i <= N; i++){
            D[i][i] = 1;
            D[i][0] = 1;
            D[i][1] = i;
        }

        for(int i = 2; i <= N; i++){
            for(int j = 1; j < i; j++){
                D[i][j] = D[i-1][j] + D[i-1][j-1];
            }
        }
        System.out.println(D[N][K]);
    }
}

/** 내 답안
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    System.out.println(P(N)/(P(N-K)*P(K)));
}
static int P(int a){
    if(a <= 1) return 1;
    return a * P(a-1);
}
*/