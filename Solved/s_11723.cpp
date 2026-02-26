#include <bits/stdc++.h>
using namespace std;
int n, x, ret;
string s;

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  cin >> n;
  for (int i = 0; i < n; i++) {
    cin >> s;
    if (s == "add") {
      cin >> x;
      ret |= (1 << (x - 1));
    } else if (s == "remove") {
      cin >> x;
      ret &= ~(1 << (x - 1));
    } else if (s == "check") {
      cin >> x;
      if (ret & (1 << (x - 1))) {
        cout << 1 << "\n";
      } else {
        cout << 0 << "\n";
      }
    } else if (s == "toggle") {
      cin >> x;
      ret ^= (1 << (x - 1));
    } else if (s == "all") {
      ret |= (1 << 20) - 1;
    } else if (s == "empty") {
      ret = 0;
    }
  }
  return 0;
}
