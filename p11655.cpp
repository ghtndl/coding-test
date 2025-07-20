#include <bits/stdc++.h>
using namespace std;
string S;
int main() {
  ios_base::sync_with_stdio(false);
  getline(cin, S);
  for (int i = 0; i < S.size(); i++) {
    if (S[i] < 97 && S[i] > 64) {
      if (S[i] + 13 < 91) {
        S[i] += 13;
      } else {
        S[i] -= 13;
      }
    } else if (123 > S[i] && S[i] > 96) {
      if (S[i] + 13 < 123) {
        S[i] += 13;
      } else {
        S[i] -= 13;
      }
    }
    cout << S[i];
  }
}