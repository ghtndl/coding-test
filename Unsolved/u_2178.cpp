#include <bits/stdc++.h>
using namespace std;
int n, m;
const int max_n = 104;
int a[max_n][max_n], visited[max_n][max_n];
int dy[] = {-1, 0, 1, 0};
int dx[] = {0, 1, 0, -1};

void BFS(int y, int x) {
  queue<pair<int, int>> q;
  visited[y][x] = 1;
  q.push({y, x});
  while (q.size()) {
    tie(y, x) = q.front();
    q.pop();
    for (int i = 0; i < 4; i++) {
      int ny = y + dy[i];
      int nx = x + dx[i];
      if (ny < 0 || ny >= n || nx < 0 || nx >= m || a[ny][nx] == 0) continue;
      if (visited[ny][nx]) continue;
      visited[ny][nx] = visited[y][x] + 1;
      q.push({ny, nx});
    }
  }
  return;
}

int main() {
  scanf("%d %d", &n, &m);
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
      scanf("%1d", &a[i][j]);
    }
  }

  BFS(0, 0);

  cout << visited[n - 1][m - 1] << '\n';
  return 0;
}