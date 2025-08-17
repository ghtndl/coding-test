#include <bits/stdc++.h>
using namespace std;
int n, cnt;
string S;
int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  cin >> n;
  for (int i = 0; i < n; i++) {
    cin >> S;
    stack<char> stk;
    for (char a : S) {
      if (stk.size() && stk.top() == a)
        stk.pop();
      else
        stk.push(a);
    }
    if (stk.size() == 0) cnt++;
  }
  cout << cnt << '\n';
}