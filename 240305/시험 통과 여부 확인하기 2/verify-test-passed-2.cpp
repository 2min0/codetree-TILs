#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    cin >> n;
    int cnt = 0;
    for (int i=1; i<=n; i++){
        int a, b, c, d;
        cin >> a>>b>>c>>d;
        if ((a+b+c+d)/4 >= 60 ){
            cout << "pass";
            cnt += 1;
        }
        else{
            cout << "fail";
        }
        cout << endl;
    }
    cout << cnt;
    return 0;
}