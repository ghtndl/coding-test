#include <bits/stdc++.h>
using namespace std;
string string_add(string a, string b) {
  int sum = 0;
  string ret;
  while (a.size() || b.size() || sum) {  // a 랑 b의 길이가 다를 수 있으니까
    if (a.size()) {
      sum += a.back() - '0';
      a.pop_back();
    }
    if (b.size()) {
      sum += b.back() - '0';
      b.pop_back();
    }
    ret += (sum % 10) + '0';  // 다시 문자열로 치환 및 더한 값들 이어주기
                              // 가장 높은 자릿수의 올림수가 남아있다면 붙여주기
    sum /=
        10;  // 이전 자릿수에서 10이 넘은 경우 다음 자릿수에 1을 더해주기 위함
  }
  reverse(ret.begin(), ret.end());
  return ret;
}
string a, b;
int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(0);
  cout.tie(0);
  cin >> a >> b;
  cout << string_add(a, b) << '\n';
  return 0;
}