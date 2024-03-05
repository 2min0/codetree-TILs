#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n1, n2;
    cin >> n1 >> n2;

    int arr1[100] = {};
    int arr2[100] = {};
    for (int i=0; i<n1; i++){
        cin >> arr1[i];
    }
    for (int i=0; i<n2; i++){
        cin >> arr2[i];
    }

    int cnt = 0;
    bool success = false;
    for (int i=0; i <=n1; i++){
        if (arr1[i] == arr2[cnt]){
            cnt += 1;
            if (cnt == n2){
                cout << "Yes";
                success = true;
                break;
            }
        }
        else{
            cnt = 0;
        }
    }
    if (success == false){
        cout << "No";  
    }

    return 0;
}