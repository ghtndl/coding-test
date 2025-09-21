#include <bits/stdc++.h>
using namespace std;
int m, n, k;
vector<int> ret;
#define y1 aaaa
int x1, x2, y1, y2;
int a[104][104];
int visited[104][104];
int dy[] = {-1, 0, 1, 0};
int dx[] = {0, 1, 0, -1};

int dfs(int y, int x) {
  visited[y][x] = 1;
  int ret = 1;
  for (int i = 0; i < 4; i++) {
    int ny = y + dy[i];
    int nx = x + dx[i];
    if (ny < 0 || ny >= m || nx < 0 || nx >= n || visited[ny][nx] == 1)
      continue;
    if (a[ny][nx] == 1) continue;
    ret += dfs(ny, nx);
  }
  return ret;
}

int main() {
  cin >> m >> n >> k;
  for (int i = 0; i < k; i++) {
    cin >> x1 >> y1 >> x2 >> y2;
    for (int x = x1; x < x2; x++) {
      for (int y = y1; y < y2; y++) {
        a[y][x] = 1;
      }
    }
  }

  for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
      if (a[i][j] != 1 && !visited[i][j]) {
        ret.push_back(dfs(i, j));
      }
    }
  }
  sort(ret.begin(), ret.end());
  cout << ret.size() << "\n";
  for (int a : ret) cout << a << " ";
}