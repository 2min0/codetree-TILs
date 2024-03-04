#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int a, b, c;
    cin >> a >> b >> c;
    int sum = a+b+c;
    int mean = sum/3;
    cout << sum << endl << mean << endl << sum - mean;
    return 0;
}