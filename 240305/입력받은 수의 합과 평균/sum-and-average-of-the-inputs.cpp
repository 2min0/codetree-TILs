#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    cin >> n;
    int sum_val = 0;
    for (int i = 1; i<= n; i++){
        int k;
        cin >> k;
        sum_val += k;
    }
    cout << fixed;
    cout.precision(1);
    cout << sum_val << " " << double(sum_val)/n;
    return 0;
}