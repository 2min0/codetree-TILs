#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    string x;
    cin >> x;
    int len_x = x.length();
    cout << x << endl;
    for (int i=1; i<=len_x; i++){
        x = x.substr(len_x-1, 1) + x.substr(0, len_x-1);
        cout << x << endl;
    }
    return 0;
}