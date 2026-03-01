#include <bits/stdc++.h>
using namespace std;
int n, m, ret = 0, a[4][4];

int main() {
  scanf("%d %d", &n, &m);
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
      scanf("%1d", &a[i][j]);
    }
  }

  // 모든 경우의 수 안에서 실행 2^16
  for (int s = 0; s < (1 << (n * m)); s++) {
    // 초기 모든 조각의 합 sum 초기화
    int sum = 0;
    // 행 * 열 순으로 for문 진입
    for (int i = 0; i < n; i++) {
      // 한개의 행 안에서 값을 더할 cur 초기화
      int cur = 0;
      for (int j = 0; j < m; j++) {
        // 현재 인덱스 계산
        int k = i * m + j;
        // 가로면 (0이면) 더해주기
        // 가로가 이어지면 10씩 곱해주면서 7, 74, 741 ... 이런식으로 만들어줌
        if ((s & (1 << k)) == 0) {
          cur = cur * 10 + a[i][j];
        } else {
          sum += cur;
          cur = 0;
        }
      }
      sum += cur;
    }
    for (int j = 0; j < m; j++) {
      int cur = 0;
      for (int i = 0; i < n; i++) {
        int k = i * m + j;
        if ((s & (1 << k)) != 0) {
          cur = cur * 10 + a[i][j];
        } else {
          sum += cur;
          cur = 0;
        }
      }
      sum += cur;
    }
    ret = max(ret, sum);
  }

  cout << ret << "\n";
  return 0;
}