#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n, m;
    cin >> m;
    for (int j=1;j<=m;j++){
        cin >> n;
        int cnt = 0;
    while (n > 1){
        if (n%2==0){
            n /= 2;
        }
        else{
            n = 3*n+1;
        }
        cnt += 1;
    }
    cout << cnt << endl;
    }
        return 0;
}