package codingtest.datastructure.prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int suNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());

        long[]S = new long[suNo + 1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }

        for(int q = 0; q<=quizNo; q++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(S[b] - S[a-1]);
        }

    }
}

/**
 24.12.12 내가 푼 답안
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        int[] srr = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= N; i++) {
            srr[i] = srr[i-1] + arr[i];
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken()); //구간 작은값
            int l = Integer.parseInt(st.nextToken()); //구간 큰값
            System.out.println(srr[l] - srr[k-1]);
        }
    }
}
 */