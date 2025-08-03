#include <bits/stdc++.h>
using namespace std;
string s, ret;
int cnt[200], flag;
char mid;
int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(0);
  cout.tie(0);
  cin >> s;
  for (char a : s) cnt[a]++;  // 알파벳 중복 갯수 카운팅
  for (int i = 'Z'; i >= 'A'; i--) {
    if (cnt[i]) {        // i 알파벳이 존재하는 경우 (ex. Z가 존재하는가?)
      if (cnt[i] & 1) {  // 홀수인지 알아내는 And 연산자
        mid = char(i);   // 만약 홀수놈을 발견하면 mid에 저장해둠
        flag++;
        cnt[i]--;  // 홀수면 하나를 빼서 두개로 만들고 다음 로직에서 2개씩
                   // 움직이게 해야되기에
      }
      if (flag == 2) break;
      for (int j = 0; j < cnt[i]; j += 2) {
        ret = char(i) + ret;
        ret += char(i);
      }
    }
  }
  if (mid)
    ret.insert(ret.begin() + ret.size() / 2,
               mid);  // 아까 저장해둔 mid를 중간에 집어넣기
  if (flag == 2)
    cout << "I'm Sorry Hansoo\n";
  else
    cout << ret << "\n";
}