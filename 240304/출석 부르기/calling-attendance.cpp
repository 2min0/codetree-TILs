#include <iostream>
using namespace std;
#include <string>

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    cin >> n;
    string ans;
    if (n==1){
        ans = "John";
    }
    else if (n==2){
        ans = "Tom";
    }
    else if (n==3){
        ans = "Paul";
    }
    else {
        ans = "Vacancy";
    }
    cout << ans;
    return 0;
}