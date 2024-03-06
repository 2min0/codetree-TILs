#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n, cnt=0;
    cin >> n;
    int arr[n][n] = {};
    for (int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            cnt += 1;
            arr[j][i] = cnt;
        }
    }
    for (int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            cout << arr[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}