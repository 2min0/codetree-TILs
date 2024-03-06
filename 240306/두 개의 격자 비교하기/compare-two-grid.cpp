#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n, m;
    cin >> n >> m;
    int arr[n][m] = {};
    for (int i=0; i<n; i++){
        for (int j=0; j<m; j++){
            cin >> arr[i][j];
        }
    }
    int x;
    for (int i=0; i<n; i++){
        for (int j=0; j<m; j++){
            cin >> x;
            if (x == arr[i][j]){
                cout << 0 << " ";
            }
            else
                cout << 1 << " ";
        }
        cout << endl;
    }
    return 0;
}