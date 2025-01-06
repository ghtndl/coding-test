package codingtest.graph.unionfind;

import java.util.Scanner;

public class P1717 {
    static int[] parent;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        parent = new int[N+1];

        for(int i = 0; i < N+1; i++) { // 대표노드 초기화
            parent[i] = i;
        }

        for(int i =0; i < M; i++) {
            int question = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(question == 0){
                union(a,b);
            }
            else {
                boolean result = checkSame(a,b);
                if(result) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }
    }
    private static void union(int a, int b) {
        //대표노드 찾아서 연결
        a = find(a);
        b = find(b);
        if(a != b){
            parent[b] = a;
        }
    }

    private static int find(int a) {
        if(a == parent[a]) return a;
        else {
            return parent[a] = find(parent[a]); //value를 index로 바꿔서 또 찾기
        }          // parent[a] = 이거 꼭 있어야함 빠져나오면서 값을 나 바꿔주는것이기 때문
    }

    private static boolean checkSame(int a, int b) {
        a = find(a);
        b = find(b);
        if(a == b) return true;
        return false;
    }
}
