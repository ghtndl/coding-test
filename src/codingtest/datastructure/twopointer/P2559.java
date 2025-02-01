package codingtest.datastructure.twopointer;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        int start = 0;
        int end = K-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(end<N){
            int answer = 0;
            for(int i = start; i<=end; i++){
                answer += A[i];
            }
            list.add(answer);
            start++;
            end++;
        }
        int ans = Integer.MIN_VALUE;
        for(int i : list){
            ans = Math.max(i,ans);
        }
        System.out.println(ans);
    }
}