#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    cin >> n;
    int arr[n] = {};
    int cnt = 0;
    for (int i=1; i<=n; i++){
        int a;
        cin >> a;
        if (a == 2){
            cnt += 1;
        }
        if (cnt == 3){
            cout << i;
            break;
        }
    }

    return 0;
}