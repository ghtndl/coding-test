// 강의 답안
#include <bits/stdc++.h>
using namespace std;
int T;
string s;
bool check(string s) {
  stack<char> stk;
  for (char c : s) {
    if (c == '(')
      stk.push(c);
    else {
      if (!stk.empty())
        stk.pop();
      else
        return false;
    }
  }
  return stk.empty();
}

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(0);
  cout.tie(0);
  cin >> T;
  for (int i = 0; i < T; i++) {
    cin >> s;
    if (check(s))
      cout << "YES\n";
    else
      cout << "NO\n";
  }
  return 0;
}

/* 내가 푼 답안
#include <bits/stdc++.h>
using namespace std;
int T;
string s;

int main() {
  cin >> T;
  for (int i = 0; i < T; i++) {
    cin >> s;
    int score = 0;
    bool flag = true;
    for (int j = 0; j < s.size(); j++) {
      if (score >= 0 && s[j] == '(') {
        score++;
      } else if (score > 0 && s[j] == ')') {
        score--;
      } else {
        flag = false;
        break;
      }
    }
    if (score > 0) {
      flag = false;
    }
    if (score == 0 && flag) {
      cout << "YES" << "\n";
    } else {
      cout << "NO" << "\n";
    }
  }
  return 0;
}
  */