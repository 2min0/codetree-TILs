#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int a, b;
    cin >> a >> b;
    int ans = 0;
    for (int i=a; i<=b; i++){
        int cnt = 1;
        for (int j=1; j <i; j++){
            if (i%j==0){
                cnt += 1;
            }
        }
        if (cnt==3){
            ans += 1;
        }
    }
    cout << ans;
    return 0;
}