#include <bits/stdc++.h>
using namespace std;
string s, temp;
int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL), cout.tie(NULL);
  cin >> s;
  temp = s;
  reverse(temp.begin(), temp.end());
  if (s == temp) {
    cout << 1 << '\n';
  } else {
    cout << 0 << '\n';
  }
  return 0;
}