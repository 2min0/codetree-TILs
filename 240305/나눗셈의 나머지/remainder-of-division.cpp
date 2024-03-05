#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int a, b;
    cin >> a >> b;
    int ans = 0;
    int arr[10] = {};
    while (a>1){
        arr[a%b] += 1;
        a /= b;
    }
    for (int i=0; i<=9; i++){
        ans += (arr[i]*arr[i]);
    }
    cout << ans;
    return 0;
}