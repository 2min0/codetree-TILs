#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    cin >> n;
    int ans = 0;

    while (true){
        if (n==1){
            break;
        }
        else{
            n /= 2;
            ans += 1;
        }
    }
    cout << ans;
    return 0;
}