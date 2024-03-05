#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int arr[10];
    for (int i=0;i<=10;i++){
        int a;
        if (i==10){
             for (int j=i-1; j>=0; j--){
                cout << arr[j] << " ";
            }
            break;
        }
        cin >> a;
        if (a==0){
            for (int j=i-1; j>=0; j--){
                cout << arr[j] << " ";
            }
            break;
        }
        else{
            arr[i] = a;
        }
    }
    return 0;
}