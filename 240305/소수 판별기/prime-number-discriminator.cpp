#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    cin >> n;
    char ans = 'P';
    for (int i =2; i<n;i++){
        if (n%i==0){
            ans = 'C';
            break;
        }
    }
    cout << ans;
    return 0;
}