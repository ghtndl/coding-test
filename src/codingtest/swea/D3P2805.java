package codingtest.swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3P2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {

            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][N];
            int result = 0;

            for (int i = 0; i < N; i++) {
                String s = br.readLine();
                for (int j = 0; j < N; j++) {
                    arr[i][j] = s.charAt(j) - '0';
                }
            }
            int mid = N/2;
            int midL = mid;
            int midR = mid;

            for (int i = 0; i < N; i++) {
                for (int j = midL; j <= midR; j++) {
                    result += arr[i][j];
                }
                if(i<mid){
                    midL--;
                    midR++;
                } else {
                    midL++;
                    midR--;
                }
            }
            System.out.println("#" + tc + " " + result);
        }
    }
}
