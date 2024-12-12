package codingtest.swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D3P1220 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[100][100];
        for (int tc = 1; tc <= 1; tc++) {
            int n = Integer.parseInt(br.readLine()); // 한 변의 길이


            //테이블 저장. 100*100 배열에 각 값을 입력
            for (int i = 0; i < 100; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int sum = 0;

            // 세로줄 하나씩 탐색
            for (int i = 0; i < 100; i++) {
                int last = 0;   //최근 마지막 자성체 0: 없음 , 1: N , 2: S
                for (int j = 0; j < 100; j++) {
                    if (arr[j][i] == 1) {   /**세로줄(열)을 먼저 쭉 돌아야하기 때문에 안쪽 for문에 j를 넣었음*/
                        last = 1;
                    } else if (arr[j][i] == 2) {
                        if (last == 1) {
                            sum++;
                        }
                        last = 2;
                    }
                }
            }
            System.out.println("#" + tc + " "+ sum);
        }
        br.close();
    }
}
