#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    cin >> n;
    int init = (int)'A';
    for (int i=1; i<=n ; i++){
        for (int j=1; j<=n;j++){
            cout << (char)init;
            init += 1;
        }
        cout << endl;
    }
    return 0;
}