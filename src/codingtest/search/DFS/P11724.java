package codingtest.search.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11724 {
    static boolean[] visited;
    static ArrayList<Integer>[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1]; //0번 인덱스 제외 (헷갈림 방지)
        A = new ArrayList[n + 1];

        for(int i = 1; i < n+1; i++) {
            A[i] = new ArrayList<Integer>();    //각 인덱스별로 어레이리스트
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            A[s].add(t);
            A[t].add(s);
        }

        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if(!visited[i]){
                cnt++;
                DFS(i);
            }
        }
        System.out.println(cnt);

    }

    private static void DFS(int v) {
        if(visited[v]){ //현재 노드가 방문노드이면
            return;     //더이상 탐색 X
        }
        visited[v] = true;  //방문 노드기록하기

        for(int i: A[v]){   //재귀함수
            if(!visited[i]){
                DFS(i);
            }
        }
    }
}
