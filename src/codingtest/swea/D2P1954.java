package codingtest.swea;

import java.util.Scanner;

public class D2P1954 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {

            int N = sc.nextInt();
            int[][]snail = new int[N][N];
            int[]dr = {0, 1, 0, -1};
            int[]dc = {1, 0, -1, 0};
            int dir = 0;
            int row = 0, col = 0;
            snail[row][col] = 1;

            for (int num =2; num <=N*N; num++){
                int nr = row + dr[dir];
                int nc = col + dc[dir];

                if( nr<0 || nc<0 || nr>=N || nc>=N || snail[nr][nc] != 0 ){
                    dir = (dir+1)%4;
                    nr = row + dr[dir];
                    nc = col + dc[dir];
                }

                row =nr;
                col = nc;
                snail[row][col] = num;
            }
            System.out.println("#"+tc);
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    System.out.print(snail[i][j]+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
