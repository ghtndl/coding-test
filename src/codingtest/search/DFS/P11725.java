package codingtest.search.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11725 {
    static boolean[] visited;
    static ArrayList<Integer>[] list;
    static int parent[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        visited = new boolean[N+1];
        list = new ArrayList[N+1];
        parent = new int[N+1];

        for(int i = 1; i <= N; i++){
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i < N-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list[s].add(e);
            list[e].add(s);
        }

        DFS(1,0);

        for(int j = 2; j < parent.length; j++){
            System.out.println(parent[j]);
        }
    }

    private static void DFS(int current, int parentNode){
        if(visited[current]) return;
        visited[current] = true;
        parent[current] = parentNode;

        for(int i : list[current]){
            if(!visited[i]){
                DFS(i, current);
            }
        }
    }
}
