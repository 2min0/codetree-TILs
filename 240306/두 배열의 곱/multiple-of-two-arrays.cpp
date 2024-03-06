#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int arr1[3][3] = {};
    for (int i=0; i<3; i++){
        for (int j=0; j<3; j++){
            cin >> arr1[i][j];
        }
    }
    int x;
    for (int i=0; i<3; i++){
        for (int j=0; j<3; j++){
            cin >> x;
            x *= arr1[i][j];
            cout << x << " ";
        }
        cout << endl;
    }

    return 0;
}