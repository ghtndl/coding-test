#include <bits/stdc++.h>
using namespace std;
int N, K, words[55];
string S;
void fastIO() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
}

int count(int mask) {
  int cnt = 0;
  for (int word : words) {
    if (word && (word & mask) == word) cnt++;
  }
  return cnt;
}

int go(int index, int k, int mask) {
  if (k < 0) return 0;
  if (index == 26) return count(mask);

  int take = go(index + 1, k - 1, mask | (1 << index));

  int skip = 0;

  if (index != 'a' - 'a' && index != 'n' - 'a' && index != 't' - 'a' &&
      index != 'i' - 'a' && index != 'c' - 'a') {
    skip = go(index + 1, k, mask);
  }

  return max(take, skip);
}

int main() {
  fastIO();
  cin >> N >> K;
  for (int i = 0; i < N; i++) {
    cin >> S;
    for (char str : S) {
      words[i] |= 1 << (str - 'a');
    }
  }
  cout << go(0, K, 0) << "\n";
  return 0;
}