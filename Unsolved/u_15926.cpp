#include <bits/stdc++.h>
using namespace std;
int n, ret = 0, sum = 0, d[2000004];
string s;
stack<int> stk;

void fastIO() {
  ios_base::sync_with_stdio(false);
  cin.tie(0);
  cout.tie(0);
}

int main() {
  fastIO();
  cin >> n;
  cin >> s;
  stk.push(-1);
  for (int i = 0; i < n; i++) {
    if (s[i] == '(') {
      stk.push(i);
    }
    if (s[i] == ')') {
      stk.pop();
      if (!stk.empty()) {
        ret = max(ret, i - stk.top());
      } else {
        stk.push(i);
      }
    }
  }
  cout << ret << '\n';
  return 0;
}

/*
스택 기반 문제 풀이
#include <bits/stdc++.h>
using namespace std;
int n, ret = 0;
string s;
stack<int> stk;

void fastIO() {
  ios_base::sync_with_stdio(false);
  cin.tie(0);
  cout.tie(0);
}

int main() {
  fastIO();
  cin >> n;
  cin >> s;
  stk.push(-1);
  for (int i = 0; i < n; i++) {
    if (s[i] == '(') {
      stk.push(i);
    }
    if (s[i] == ')') {
      stk.pop();
      if (!stk.empty()) {
        ret = max(ret, i - stk.top());
      } else {
        stk.push(i);
      }
    }
  }
  cout << ret << '\n';
  return 0;
}
*/