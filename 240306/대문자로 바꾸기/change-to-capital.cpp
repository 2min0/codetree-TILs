#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    char x;
    for (int i=0; i <=4; i++){
        for (int j=0; j<=2; j++){
            cin >> x;
            cout << char(int(x)-32) << " ";
        }
        cout << endl;
    }
    return 0;
}