package codingtest.swea;

import java.util.Scanner;

public class D3P1289 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();    //테스트 케이스
        for(int tc = 0; tc < T; tc++) {
            int count = 0;
            char[] a = sc.next().toCharArray();  //입력값
            char[] b = new char[a.length];    //초기값 설정
            for(int i = 0; i < a.length; i++) {
                b[i] = '0';
            }
            for(int i = 0; i < a.length; i++) {
                if(a[i]!=b[i]) {
                    count++;
                    for(int j = i; j < b.length; j++) {
                        b[j] = a[i];
                    }
                }
            }

            System.out.println("#"+(tc+1)+" "+count);
        }
    }
}
