#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int n, k, temp, psum[100001], ret = -1000004;
int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(0);
  cout.tie(0);
  cin >> n >> k;
  for (int i = 1; i <= n; i++) {
    cin >> temp;
    psum[i] = psum[i - 1] + temp;
  }
  for (int i = k; i <= n; i++) {
    ret = max(ret, psum[i] - psum[i - k]);
  }
  cout << ret << "\n";
  return 0;
}

/*=====================================*/

// #include <bits/stdc++.h>
// using namespace std;
// int N, K, S, E;
// int _min = -10000001;
// int answer = _min;
// int main() {
//   ios_base::sync_with_stdio(false);
//   cin.tie(0);
//   cin.tie(0);

//   cin >> N >> K;
//   int arr[N];
//   for (int i = 0; i < N; i++) {
//     cin >> arr[i];
//   }

//   S = 0;
//   E = K - 1;
//   int tmp = 0;
//   for (int j = S; j <= E; j++) {
//     tmp += arr[j];
//   }
//   answer = max(answer, tmp);

//   while (E < N - 1) {
//     tmp -= arr[S];
//     S++;
//     E++;
//     tmp += arr[E];
//     answer = max(answer, tmp);
//   }

//   cout << answer << '\n';
// }