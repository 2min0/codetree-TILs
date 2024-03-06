#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    string x;
    cin >> x;
    cout << x.erase(x.find('e'), 1);
    return 0;
}