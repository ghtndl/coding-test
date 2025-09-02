#include <bits/stdc++.h>
using namespace std;
int A, B, C;
int arr[104];
int s, e;
int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(0);
  cout.tie(0);

  cin >> A >> B >> C;
  for (int i = 0; i < 3; i++) {
    cin >> s >> e;
    for (int j = s; j < e; j++) {
      arr[j]++;
    }
  }

  int cnt = 0;

  for (int k : arr) {
    if (k == 1) {
      cnt += k * A;
    } else if (k == 2) {
      cnt += k * B;
    } else if (k == 3) {
      cnt += k * C;
    }
  }
  cout << cnt << '\n';
}
