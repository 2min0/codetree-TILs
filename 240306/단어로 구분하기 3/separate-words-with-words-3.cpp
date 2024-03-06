#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    string list[10] = {};
    for (int i=1; i<=10; i++){
        string x;
        cin >> x;
        list[i-1] = x;
    }
    for (int i=1; i<=10; i++){
        cout << list[10-i] << endl;
    }
    return 0;
}