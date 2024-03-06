#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    string input, object;
    cin >> input;
    cin >> object;
    int ans = input.find(object);
    if (ans != string::npos){
        cout << ans;
    }
    else{
        cout << -1;
    }
    return 0;
}