#include <bits/stdc++.h>
using namespace std;
int n, m, T, K, x, y;
int a[52][52];
int visited[52][52];
int dy[] = {-1, 0, 1, 0};
int dx[] = {0, 1, 0, -1};

void DFS(int y, int x) {
  visited[y][x] = 1;
  for (int i = 0; i < 4; i++) {
    int ny = y + dy[i];
    int nx = x + dx[i];
    if (ny < 0 || ny >= n || nx < 0 || nx >= m || a[ny][nx] == 0) continue;
    if (!visited[ny][nx]) {
      DFS(ny, nx);
    }
  }
  return;
}

int main() {
  cin >> T;
  vector<int> ret;
  for (int tc = 0; tc < T; tc++) {
    int answer = 0;
    cin >> m >> n >> K;
    memset(a, 0, sizeof(a));
    memset(visited, 0, sizeof(visited));
    for (int i = 0; i < K; i++) {
      cin >> x >> y;
      a[y][x] = 1;
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (a[i][j] == 1 && !visited[i][j]) {
          answer++;
          DFS(i, j);
        }
      }
    }
    ret.push_back(answer);
  }
  for (int i : ret) {
    cout << i << '\n';
  }
}