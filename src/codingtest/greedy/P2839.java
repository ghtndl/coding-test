package codingtest.greedy;

import java.util.Scanner;

public class P2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;

        while (N >= 0) {
            if (N % 5 == 0) {  // 남은 설탕이 5kg으로 나누어 떨어지면
                count += N / 5;  // 5kg 봉지의 개수를 추가
                System.out.println(count);
                return;
            }
            N -= 3;  // 3kg 봉지를 하나 사용
            count++;  // 봉지 개수 추가
        }

        // 정확히 나눌 수 없는 경우
        System.out.println("-1");
    }
}