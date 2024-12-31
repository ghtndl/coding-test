package codingtest.greedy;

import java.util.Scanner;

public class P1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();  // 입력받은 S
        long N = 1;  // 자연수의 시작을 1로 설정
        long sum = 0;  // 합계 변수

        while (sum + N <= S) {  // 현재 합계에 다음 숫자를 더했을 때 S를 넘지 않는 경우
            sum += N;  // 합계에 현재 숫자 추가
            N++;  // 다음 숫자로 이동
        }

        System.out.println(N - 1);  // 마지막으로 추가된 숫자 전의 숫자가 답
    }
}