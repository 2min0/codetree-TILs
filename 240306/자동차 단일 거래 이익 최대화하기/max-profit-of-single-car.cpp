#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    cin >> n;
    int arr[n] = {};

    for (int i=1; i<=n; i++) cin >> arr[i-1];
    
    int ans = 0;
    if (n==1) cout << 0;
    else{
        for (int i=0; i<=n-2;i++){
            for (int j=i+1; j<=n-1; j++){
                if (arr[j] > arr[i] && arr[j]-arr[i] > ans){
                    ans = arr[j] - arr[i];
                }
            }
        }
        cout << ans;
    }

    return 0;
}