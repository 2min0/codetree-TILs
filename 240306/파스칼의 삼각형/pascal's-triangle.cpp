#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    cin >> n;
    int arr[n][n] = {};
    for (int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            if (j==0 || i==j){
                arr[i][j] = 1;
            }
            else{
                if (arr[i-1][j-1] == 0 || arr[i-1][j]==0){
                    ;
                }
                else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }
    }
    for (int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            if (arr[i][j] == 0){
                ;
            }
            else{
                cout << arr[i][j] << " ";
            }
        }
        cout << endl;
    }
    return 0;
}