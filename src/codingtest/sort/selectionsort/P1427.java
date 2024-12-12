package codingtest.sort.selectionsort;

import java.util.Scanner;

public class P1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();                 // 입력값
        int[] A = new int[str.length()];            // 입력값을 담을 배열
        for (int i = 0; i < str.length(); i++) {    // 입력값을 배열에 잘라서 담기
            A[i] = Integer.parseInt(str.substring(i,i+1));  // i, i+1은 범위를 나타냄 ex) 0번째 인덱스를 알고싶으면 0,1
                                                            // 0,1번째 인덱스를 알고싶으면 0,2 처럼 i이상 i+1미만을 나타냄
        }
        for(int i = 0; i < str.length(); i++){
            int Max = i;                            // 내립차순이므로 Max를 i로 설정
            for(int j = i+1; j < str.length(); j++){
                if(A[j] > A[Max]){                  // 내가 최댓값이라고 지정한 값이 j 보다 작을 경우
                    Max = j;                        // 최댓값의 인덱스번호를 Max에 저장
                }
            }
            if(A[i] < A[Max]){                      // A[i]값이 A[Max]보다 작으면 스왑
                int temp = A[i];                    // 위에서 Max = j로 했기 때문에 무조건 인덱스값은 Max > i임
                A[i] = A[Max];
                A[Max] = temp;
            }
        }
        for(int i : A){
            System.out.print(i);
        }
    }
}
