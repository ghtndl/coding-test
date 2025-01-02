package codingtest.search.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P2606 {
    static boolean[] check;
    static ArrayList<Integer>[] list;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        check = new boolean[N + 1];
        list = new ArrayList[N + 1];
        for(int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list[s].add(e);
            list[e].add(s);
        }
        count = 0;
        DFS(1);
        System.out.println(count);
    }
    private static void DFS(int v){
        if(check[v]) return;
        check[v] = true;
        if(v != 1) count++;
        for(int i : list[v]){
            if(!check[i]) DFS(i);
        }
    }
}