#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    int a, b, c;
    cin >> n;
    a = b = c = 0;
    for (int i = 0; i<=n; i++){
        if (i==0){
            continue;
        }
        if (i%12 == 0){
            c += 1;
        }
        else if (i%3 == 0){
            b+= 1;
        }
        else if (i%2 == 0){
            a += 1;
        }
    }
    cout << a << " " << b << " " << c;
    return 0;
}