#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    string a, b;
    cin >> a >> b;
    if (a+b == b+a){
        cout << "true";
    }
    else{
        cout << "false";
    }
    return 0;
}