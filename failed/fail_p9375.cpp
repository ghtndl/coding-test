#include <bits/stdc++.h>
using namespace std;
int tc, n;
string a, b;
typedef long long ll;
int main() {
  cin >> tc;
  while (tc--) {
    map<string, int> _map;
    cin >> n;
    for (int i = 0; i < n; i++) {
      cin >> a >> b;
      _map[b]++;
    }
    ll ret = 1;
    for (auto c : _map) {
      ret *= ((ll)c.second + 1);
    }
    ret--;
    cout << ret << '\n';
  }
  return 0;
}