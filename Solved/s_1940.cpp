#include <bits/stdc++.h>
using namespace std;
int N, M, s, l, cnt;
int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(0);
  cout.tie(0);
  cin >> N;
  cin >> M;
  int arr[N];
  for (int i = 0; i < N; i++) {
    cin >> arr[i];
  }
  sort(arr, arr + N);
  s = 0;
  l = N - 1;
  cnt = 0;

  while (s < l) {
    if (arr[s] + arr[l] < M) {
      s++;
    } else if (arr[s] + arr[l] == M) {
      cnt++;
      s++;
      l--;
    } else if (arr[s] + arr[l] > M) {
      l--;
    }
  }
  cout << cnt << '\n';
  return 0;
}