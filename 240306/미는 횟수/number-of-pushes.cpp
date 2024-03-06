#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    string a, b;
    cin >> a >> b;
    string aa = a + a;
    if (aa.find(b) != string::npos){
        int val = aa.find(b);
        string bb = b+b;
        if (bb.find(a) < val){
            cout << bb.find(a);
        }
        else{
            cout << val;
        }
    }
    else{
        cout << -1;
    }
    return 0;
}