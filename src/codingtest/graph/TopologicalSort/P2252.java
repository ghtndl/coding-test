package codingtest.graph.TopologicalSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2252 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //학생 (노드)
        int M = sc.nextInt(); //비교 횟수
        ArrayList<Integer>[] list = new ArrayList[N+1];
        int[] indegree = new int[N+1];
        for(int i = 1; i <= N; i++){
            list[i] = new ArrayList<>();
        }
        for(int i = 0; i < M; i++){
            int S = sc.nextInt();
            int E = sc.nextInt();
            list[S].add(E);
            indegree[E]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int now = q.poll();
            System.out.print(now+" ");
            for(int next : list[now]){
                indegree[next]--;
                if(indegree[next] == 0){
                    q.offer(next);
                }
            }
        }
    }
}