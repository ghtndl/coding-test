#include <bits/stdc++.h>
using namespace std;
#define prev aaa
#define next aaaa
const int max_n = 200004;
int n, k, ret, here, cnt, next, prev[max_n], visited[max_n];
vector<int> v;
queue<int> q;
void fastIO() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
}

int main() {
  cin >> n >> k;
  visited[n] = 1;
  q.push(n);
  while (!q.empty()) {
    here = q.front();
    if (here == k) {
      ret = visited[k];
      break;
    }
    q.pop();
    for (int next : {here + 1, here - 1, here * 2}) {
      if (0 > next || next >= max_n || visited[next]) continue;
      visited[next] = visited[here] + 1;
      prev[next] = here;
      q.push(next);
    }
  }
  for (int i = k; i != n; i = prev[i]) {
    v.push_back(i);
  }
  v.push_back(n);
  cout << ret - 1 << '\n';
  reverse(v.begin(), v.end());
  for (int i : v) cout << i << ' ';
  return 0;
}