#include <iostream>
#include <cmath>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    cin >> n;
    int cnt = 1;
    for (int i =2; i<=pow(n, 0.5); i++){
        if (n%i==0){
            cnt += i;
            cnt += n/i;
        }
    }
    if (cnt == n){
        cout << "P";
    }
    else{
        cout << "N";
    }
    return 0;
}