#include <bits/stdc++.h>
using namespace std;
int X, cnt;
void fastIO() {
  ios_base::sync_with_stdio(false);
  cin.tie(0);
  cout.tie(0);
}
int main() {
  fastIO();
  cin >> X;
  for (int i = 0; i < 7; i++) {
    if (X & (1 << i)) {
      cnt++;
    }
  }
  cout << cnt << "\n";
  return 0;
}