package codingtest.swea;

import java.util.Scanner;

public class D2P1204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for(int tc = 1; tc <= T; tc++) {
            int no = sc.nextInt(); // 테스트 케이스 번호

            int[] arr = new int[1000]; // 점수 배열
            int[] box = new int[101]; // 점수 빈도 (0~100 점수 범위)

            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                box[arr[i]]++; // 해당 점수 빈도 증가
            }

            int maxScore = 0; // 최빈값 점수
            int maxFreq = 0;  // 최빈값 빈도

            // 최빈값 탐색
            for(int i = 0; i < box.length; i++) {
                if(box[i] > maxFreq || (box[i] == maxFreq && i > maxScore)) {
                    maxFreq = box[i]; // 높은 빈도 갱신
                    maxScore = i;     // 동일 빈도일 경우 높은 점수로 갱신
                }
            }

            System.out.println("#" + tc + " " + maxScore);
        }
        sc.close();
    }
}