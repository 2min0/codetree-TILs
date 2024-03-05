#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int sum = 0;
    int cnt = 0;
    while (true){
        int k;
        cin >> k;
        if (k >= 20 && k < 30){
            sum += k;
            cnt += 1;
        }
        else{
            break;
        }
    }
    cout << fixed;
    cout.precision(2);
    cout << double(sum)/cnt;
    return 0;
}