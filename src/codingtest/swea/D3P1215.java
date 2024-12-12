package codingtest.swea;


import java.util.Scanner;

public class D3P1215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc <= 10; tc++) {
            int len = sc.nextInt();  // 회문의 길이
            char[][] map = new char[8][8]; // 8*8 배열판

            for(int i = 0; i < map.length; i++) {  // 배열 채워주기
                String str = sc.next();
                for(int j = 0; j < map[i].length; j++) {
                    map[i][j] = str.charAt(j);
                }
            }

            int cnt = 0;

            // 행 기준 탐색
            for(int i = 0; i < map.length; i++) {  // 총 8개 행을 돈다는 뜻
                for(int j = 0; j < map.length - len + 1; j++) { // 한 행에서 5개를 돌꺼라는 뜻
                    boolean flag = true; // 각 부분에 대해 flag 초기화
                    for(int k = 0; k < len / 2; k++) { // 한 개에서 양끝을 비교한다는 뜻
                        if(map[i][j + k] != map[i][j + len - 1 - k]) {
                            flag = false;
                            break; // flag가 false이면 더 이상 비교할 필요 없음
                        }
                    }
                    if(flag) cnt++; // 한 번의 반복이 끝난 후 flag가 true이면 cnt 증가
                }
            }

            // 열 기준 탐색
            for(int i = 0; i < map.length - len + 1; i++) { // 총 5개 열을 돈다는 뜻
                for(int j = 0; j < map.length; j++) {  // 8 개 행을 먼저 돈다는 뜻
                    boolean flag = true; // 각 부분에 대해 flag 초기화
                    for(int k = 0; k < len / 2; k++) {  // 한개에서 양쪽을 2번씩 비교
                        if(map[i + k][j] != map[i + len - 1 - k][j]) {
                            flag = false;
                            break; // flag가 false이면 더 이상 비교할 필요 없음
                        }
                    }
                    if(flag) cnt++; // 한 번의 반복이 끝난 후 flag가 true이면 cnt 증가
                }
            }

            System.out.println("#" + tc + " " + cnt);
        }
    }
}