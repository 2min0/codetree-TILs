#include <iostream>
#include <cmath>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int a, b;
    cin >> a >> b;
    int cnt = 0;
    for (int i=a; i<=b; i++){
        int sum = 0;
        for (int j=1; j<=i-1; j++){
            if (i % j == 0){
                sum += j;
            }
        }
        if (sum == i){
            cnt += 1;
        }
    }
    cout << cnt;
    return 0;
}