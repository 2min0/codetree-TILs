#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    cin >> n;
    int cnt = 1;
    for (int i=1; i <=n; i++){
        for (int j =1; j<=n; j++){
            if (i%2 == 1){
                cout << (i-1)*n+j << " ";
            }
            else{
                cout << i*n-j+1 << " ";
            }
        }
        cout << endl;
    }
    return 0;
}