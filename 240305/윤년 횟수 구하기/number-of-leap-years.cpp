#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    cin >> n;
    int cnt = 0;
    for (int i = 1; i<=n; i++){
        if (i%4==0){
            if (i%100==0 && i%400!=0){
                continue;
            }
            cnt += 1;
        }
    }
    cout <<cnt;
    return 0;
}