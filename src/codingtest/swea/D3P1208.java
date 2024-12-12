package codingtest.swea;

import java.io.IOException;
import java.util.Scanner;

public class D3P1208 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int P = sc.nextInt(); // 평탄화 작업 횟수

            int[] arr = new int[100];
            for (int i = 0; i < 100; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < P; i++) {
                // 현재 배열에서 가장 큰 값과 가장 작은 값의 인덱스를 찾음
                int maxIndex = 0;
                int minIndex = 0;
                for (int j = 1; j < arr.length; j++) {
                    if (arr[j] > arr[maxIndex]) maxIndex = j;
                    if (arr[j] < arr[minIndex]) minIndex = j;
                }

                // 평탄화 작업 수행: 가장 큰 값은 -1, 가장 작은 값은 +1
                arr[maxIndex]--;
                arr[minIndex]++;
            }

            // 평탄화가 끝난 후 최종 최대값과 최소값의 차이를 계산
            int max = arr[0];
            int min = arr[0];
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] > max) max = arr[j];
                if (arr[j] < min) min = arr[j];
            }

            System.out.println("#" + tc + " " + (max - min));
        }
    }
}