#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n, q;
    int arr[100] = {};
    cin >> n >> q;
    for (int i=1; i<=n; i++){
        cin >> arr[i-1];
    }
    for (int i=1; i<=q; i++){
        int a;
        cin >> a;
        if (a==1){
            int b;
            cin >> b;
            cout << arr[b-1] << endl;
        } 
        else if (a==2){
            int b;
            cin >> b;
            bool success = false;
            for (int j=0; j<=n; j++){
                if (b == arr[j]){
                    cout << j+1 << endl;
                    success = true;
                    break;
                }
            }
            if (success = false){
                cout << 0 << endl;
            }
        }
        else{
            int b, c;
            cin >> b >> c;
            for (int j=b-1; j<=c-1; j++){
                cout << arr[j] << " ";
            }
            cout << endl;
        }
    }
    return 0;
}