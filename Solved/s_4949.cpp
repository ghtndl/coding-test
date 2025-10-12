#include <bits/stdc++.h>
using namespace std;
int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(0);
  cout.tie(0);
  while (true) {
    string s;
    getline(cin, s);
    if (s == ".") break;
    stack<int> stk;
    bool check = true;
    for (int i = 0; i < s.length(); i++) {
      if (s[i] == ')') {
        if (stk.size() == 0 || stk.top() == '[') {
          check = false;
          break;
        } else {
          stk.pop();
        }
      }
      if (s[i] == ']') {
        if (stk.size() == 0 || stk.top() == '(') {
          check = false;
          break;
        } else {
          stk.pop();
        }
      }
      if (s[i] == '(') stk.push(s[i]);
      if (s[i] == '[') stk.push(s[i]);
    }
    if (check && stk.size() == 0)
      cout << "yes\n";
    else
      cout << "no\n";
  }
  return 0;
}

/*내가 푼 답안
#include <bits/stdc++.h>
using namespace std;
string s;
vector<string> ret;
void check(string s) {
  stack<char> stk;
  for (char c : s) {
    if (c == '(' || c == '[')
      stk.push(c);
    else if (c == ')' || c == ']') {
      if (stk.empty()) {
        ret.push_back("no");
        return;
      }
      char t = stk.top();
      stk.pop();
      if ((c == ')' && t != '(') || (c == ']' && t != '[')) {
        ret.push_back("no");
        return;
      }
    }
  }
  ret.push_back(stk.empty() ? "yes" : "no");
}
int main() {
  while (true) {
    getline(cin, s);
    if (s == ".") break;
    check(s);
  }
  for (string i : ret) {
    cout << i << "\n";
  }
  return 0;
}
*/