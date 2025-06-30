#include <bits/stdc++.h>
using namespace std;
int alph[26];
string str;
int main() {
  cin >> str;
  for (char i : str) {
    alph[i - 'a']++;
  }
  for (int k : alph) cout << k << " ";
  return 0;
}