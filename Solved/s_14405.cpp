#include <bits/stdc++.h>
using namespace std;
string s;
bool flag = 0;
int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  cin >> s;
  for (int i = 0; i < s.size(); i++) {
    if (i < s.size() - 1 && s.substr(i, 2) == "pi" || s.substr(i, 2) == "ka")
      i += 1;
    else if (i < s.size() - 2 && s.substr(i, 3) == "chu")
      i += 2;
    else
      flag = 1;
  }
  if (flag)
    cout << "NO\n";
  else
    cout << "YES\n";
  return 0;
}

/*
나의 답안
#include <bits/stdc++.h>
using namespace std;
string S;
bool ans = true;

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  cin >> S;
  for (int i = 0; i < S.size(); i++) {
    if (S[i] == 'p') {
      if (S[i + 1] == 'i') {
        i++;
        continue;
      } else {
        ans = false;
        break;
      }
    }
    if (S[i] == 'k') {
      if (S[i + 1] == 'a') {
        i++;
        continue;
      } else {
        ans = false;
        break;
      }
    }
    if (S[i] == 'c') {
      if (S[i + 1] == 'h' && S[i + 2] == 'u') {
        i += 2;
        continue;
      } else {
        ans = false;
        break;
      }
    }
    ans = false;
  }
  if (ans) {
    cout << "YES" << "\n";
  } else {
    cout << "NO" << "\n";
  }
  return 0;
}
*/