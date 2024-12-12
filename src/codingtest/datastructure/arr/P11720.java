package codingtest.datastructure.arr;

import java.util.Scanner;

public class P11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
    }
}

/**     나의 답. 오답
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int N = sc.nextInt();
 int[] M = new int[N];
 for(int i = 0; i < M.length; i++){
 M[i] = sc.nextInt();
 }
 int answer = 0;
 for(int j : M){
 answer += j;
 }
 System.out.println(answer);
 }
 */
