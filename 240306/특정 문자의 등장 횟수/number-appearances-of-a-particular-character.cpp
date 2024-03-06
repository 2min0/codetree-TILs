#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    string x;
    cin >> x;
    int len = x.length();
    int cnt1 = 0, cnt2 = 0;
    for (int i=0; i<len-1; i++){
        if (x.substr(i, 2) == "ee"){
            cnt1 += 1;
        }
        else if (x.substr(i, 2) == "eb"){
            cnt2 += 1;
        }
    }
    cout << cnt1 << " " << cnt2;
    return 0;
}