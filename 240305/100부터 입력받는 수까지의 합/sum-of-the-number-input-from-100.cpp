#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    cin >> n;
    int ans = 0;
    for (int i =n; i <=100;i++){
        ans += i;
    }
    cout << ans;
    return 0;
}