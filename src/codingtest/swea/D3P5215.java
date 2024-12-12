package codingtest.swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D3P5215 {
    static int N, L, MAX;
    static int[] taste, cal;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());   //테스트 케이스

        for (int tc = 1; tc <= T; tc++) {

            st = new StringTokenizer(br.readLine(), " ");   // 공백을 넣어서 각 변수에 해당하는 값 매칭해서 넣음
            N = Integer.parseInt(st.nextToken());   //재료의 수
            L = Integer.parseInt(st.nextToken());   //제한 칼로리

            cal = new int[N];
            taste = new int[N];
            for (int i = 0; i < N; i++) {           //각
                st = new StringTokenizer(br.readLine(), " ");
                taste[i] = Integer.parseInt(st.nextToken());
                cal[i] = Integer.parseInt(st.nextToken());
            }
            MAX = 0;
            getSubSet(0,0,0);

            System.out.println("#" + tc + " " + MAX);
        }

    }

    private static void getSubSet(int cnt, int calSum, int tasteSum) {
        if(calSum > L) return;  //최대 칼로리 초과하면 돌아가기
        if(cnt == N){           //마지막 재료까지 확인했으면 빠져나오기
            if(calSum <= L) MAX = Math.max(tasteSum, MAX);   //현재 조합과 맥스값 비교해서 맥스에 대입
            return;
        }
        //선택하는 경우
        getSubSet(cnt + 1, calSum + cal[cnt], tasteSum + taste[cnt]);
        //선택하지 않는 경우
        getSubSet(cnt + 1, calSum, tasteSum);
    }
}
