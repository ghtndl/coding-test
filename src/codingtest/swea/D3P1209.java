package codingtest.swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D3P1209 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[100][100];
        for (int tc = 1; tc<=10; tc++){

            // 100*100 배열 채우기
            for(int i = 0; i < 100; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j = 0; j < 100; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 각 행의 합 중 최댓값 구하기
            int hangMax = 0;
            for(int i = 0; i < 100; i++){
                int result = 0;
                for(int j = 0; j < 100; j++){
                    result += arr[i][j];
                }
                if(result > hangMax){
                    hangMax = result;
                }
            }

            int yeolMax = 0;
            for(int i = 0; i < 100; i++){
                int result = 0;
                for(int j = 0; j < 100; j++){
                    result += arr[j][i];
                }
                if(result > yeolMax){
                    yeolMax = result;
                }
            }

            int hapMax = Math.max(hangMax, yeolMax);

            int judaeMax = 0;
            for(int i = 0; i < 100; i++){
                judaeMax += arr[i][i];
            }
            int redaeMax = 0;
            for(int i = 0; i < 100; i++){
                redaeMax += arr[100-i-1][i];
            }

            int daeMax = Math.max(judaeMax, redaeMax);

            int realMax = Math.max(hangMax, daeMax);
            System.out.println("#" + tc + " " + realMax);
        }
    }
}
