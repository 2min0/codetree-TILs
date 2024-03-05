#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    cin >> n;
    int nn = 1;
    cout << 1 << " " << n << " ";
    int temp;
    while (n <= 100){
        temp = n + nn;
        cout << temp << " ";
        nn = n;
        n = temp;
    }
    return 0;
}