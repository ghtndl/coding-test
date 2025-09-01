#include <bits/stdc++.h>
using namespace std;
int N, M;
string s;
map<string, int> mp1;
map<int, string> mp2;
string a[100004];
int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  cin >> N >> M;
  for (int i = 0; i < N; i++) {
    cin >> s;
    mp1[s] = i + 1;
    mp2[i + 1] = s;
    a[i + 1] = s;
  }
  for (int i = 0; i < M; i++) {
    cin >> s;
    if (atoi(s.c_str()) == 0) {
      cout << mp1[s] << "\n";
    } else {
      cout << mp2[atoi(s.c_str())] << "\n";
      // cout << a[atoi(s.c_str())] << "\n";
    }
  }
}

/*==========================================*/

// #include <bits/stdc++.h>
// using namespace std;
// int N, M;  // N : 포켓몬 갯수 , M : 문제 갯수
// string pokemon, what;
// map<int, string> po1;
// map<string, int> po2;

// int main() {
//   ios_base::sync_with_stdio(false);
//   cin.tie(0);
//   cout.tie(0);

//   cin >> N >> M;
//   for (int i = 1; i <= N; i++) {
//     cin >> pokemon;
//     po1[i] = pokemon;
//     po2[pokemon] = i;
//   }

//   for (int j = 0; j < M; j++) {
//     cin >> what;
//     if (atoi(what.c_str()) == 0) {
//       cout << po2[what] << "\n";
//     } else {
//       cout << po1[atoi(what.c_str())] << "\n";
//     }
//   }
// }