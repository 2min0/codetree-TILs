#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    string a, b;
    cin >> a >> b;
    a = a + a;
    if (a.find(b) != string::npos){
        cout << a.find(b);
    }
    else{
        cout << -1;
    }
    return 0;
}