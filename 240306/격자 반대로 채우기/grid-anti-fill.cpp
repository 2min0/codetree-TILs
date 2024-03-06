#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n, m, cnt=1;
    cin >> n;
    m = n;
    int arr[n][m] = {};
    for (int i=0; i<m; i++){
        for (int j=0; j<n; j++){
            if (i%2==0){
                arr[n-j-1][m-i-1] = cnt;
            }
            else{
                arr[j][m-i-1] = cnt;
            }
            cnt += 1;
        }
    }
    for (int i=0; i<n; i++){
        for (int j=0; j<m; j++){
            cout << arr[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}