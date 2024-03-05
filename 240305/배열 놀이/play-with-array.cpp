#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n, q;
    cin >> n >> q;
    int arr[101] = {};
    for (int i=1; i<=n; i++){
        cin >> arr[i];
    }

    for (int i=1; i<=q; i++){
        int type;
        cin >> type;
        if (type == 1){
            int a;
            cin >> a;
            cout << arr[a];
        }
        else if (type == 2){
            int a;
            cin >> a;
            bool success = false;
            for (int j=1; j<=n;j++){
                if (arr[j] == a){
                    cout << j;
                    success = true;
                    break;
                }
            }
            if (success == false){
                cout << 0;
            }
        }
        else if (type == 3){
            int a, b;
            cin >> a >> b;
            for (int j=a; j<=b; j++){
                cout << arr[j] << " ";
            }
        }
        cout << endl;
    }
    return 0;
}