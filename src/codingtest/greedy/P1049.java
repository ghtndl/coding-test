package codingtest.greedy;

import java.util.Scanner;

public class P1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //끊어진 기타줄
        int M = sc.nextInt();   //브랜드 갯수

        int[][] price = new int[M][2];  //행 : 브랜드 갯수 / 열: 가격

        for(int i = 0; i < M; i++){
            price[i][0] = sc.nextInt();
            price[i][1] = sc.nextInt();
        }
        int total = 0;
        int zool = N;
        while (zool>0){
            if(zool>=6){
                int min = Integer.MAX_VALUE;
                for(int i = 0; i < price.length; i++) {
                    min = Math.min(min, Math.min(price[i][0], price[i][1]*6));
                }
                zool -= 6;
                total += min;
            } else {
                int mini = Integer.MAX_VALUE;
                for(int i = 0; i < price.length; i++){
                    mini = Math.min(Math.min(price[i][0], price[i][1]*zool), mini);
                }
                total += mini;
                break;
            }
        }
        System.out.println(total);
    }
}
