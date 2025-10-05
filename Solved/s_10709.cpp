#include <bits/stdc++.h>
using namespace std;
int h, w;
string s;
int a[104][104];

int main() {
  cin >> h >> w;
  for (int i = 0; i < h; i++) {
    cin >> s;
    for (int j = 0; j < w; j++) {
      if (s[j] == '.') {
        a[i][j] = -1;
      } else
        a[i][j] = 0;
    }
  }

  for (int i = 0; i < h; i++) {
    for (int j = 0; j < w; j++) {
      if (a[i][j] == 0) {
        int cnt = 1;
        while (a[i][j + 1] == -1) {
          a[i][j + 1] = cnt++;
          j++;
        }
      }
    }
  }

  for (int i = 0; i < h; i++) {
    for (int j = 0; j < w; j++) {
      cout << a[i][j] << " ";
    }
    cout << "\n";
  }
  return 0;
}

/* 내가 푼 답안
#include <bits/stdc++.h>
using namespace std;
int h, w;
int ret[104][104];
char a[104][104];

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(0);
  cout.tie(0);
  cin >> h >> w;
  for (int i = 0; i < h; i++) {
    for (int j = 0; j < w; j++) {
      cin >> a[i][j];
      ret[i][j] = -1;
    }
  }

  for (int i = 0; i < h; i++) {
    for (int j = 0; j < w; j++) {
      if (a[i][j] == 'c') {
        ret[i][j] = 0;
        int _add = 1;
        for (int k = j + 1; k < w; k++) {
          if (a[i][k] == 'c') {
            ret[i][k] = 0;
            _add = 1;
            continue;
          } else if (a[i][k] == '.') {
            ret[i][k] = ret[i][j] + _add;
            _add++;
          }
        }
        break;
      }
    }
  }

  for (int i = 0; i < h; i++) {
    for (int j = 0; j < w; j++) {
      cout << ret[i][j] << " ";
    }
    cout << "\n";
  }
  return 0;
}
*/