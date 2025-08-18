#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int n;
int main() {
  while (scanf("%d", &n) != EOF) {
    ll cnt = 1, ret = 1;
    while (true) {
      if (ret % n == 0) {
        printf("%lld\n", cnt);
        break;
      } else {
        ret = (ret * 10 + 1);
        ret %= n;
        cnt++;
      }
    }
  }
  return 0;
}