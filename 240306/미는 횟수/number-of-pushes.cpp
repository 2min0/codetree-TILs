#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    string a, b;
    cin >> a >> b;
    string bb = b+b;
    if (bb.find(a) != string::npos){
        cout << bb.find(a);
        }
    else{
        cout << -1;
    }
    return 0;
}