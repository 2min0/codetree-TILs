#include <iostream>
using namespace std;
#include <climits>

int main() {
    // 여기에 코드를 작성해주세요.
    int N;
    int cnt[1001] = {};
    cin >> N;
    for (int i=1; i<=N; i++){
        int x;
        cin >> x;
        cnt[x] += 1;
    }
    int max = INT_MIN;
    for (int i=1; i<=1001; i++){
        if (cnt[i]==1 && i >= max){
            max = i;
        }
    }
    if (max == INT_MIN){
        cout << -1;
    }
    else{
        cout << max;
    }
    return 0;
}