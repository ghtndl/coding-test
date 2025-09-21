#include <bits/stdc++.h>
using namespace std;
int n;
int dy[] = {-1, 0, 1, 0};
int dx[] = {0, 1, 0, -1};
int a[104][104];
int rain;
int visited[104][104];

void DFS(int y, int x) {
  visited[y][x] = 1;
  for (int i = 0; i < 4; i++) {
    int ny = y + dy[i];
    int nx = x + dx[i];
    if (ny < 0 || ny >= n || nx < 0 || nx >= n) continue;
    if (a[ny][nx] > rain && !visited[ny][nx]) {
      DFS(ny, nx);
    }
  }
  return;
}

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(0);
  cout.tie(0);
  int _max = -1;
  cin >> n;
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      cin >> a[i][j];
    }
  }

  for (int h = 0; h <= 100; h++) {
    rain = h;
    int ret = 0;
    memset(visited, 0, sizeof(visited));
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (a[i][j] > rain && !visited[i][j]) {
          ret++;
          DFS(i, j);
        }
      }
    }
    _max = max(_max, ret);
  }
  cout << _max << '\n';
  return 0;
}