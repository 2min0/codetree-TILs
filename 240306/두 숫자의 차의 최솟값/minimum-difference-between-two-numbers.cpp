#include <iostream>
#include <climits>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n, differ;
    cin >> n;
    int arr[n] = {};
    for (int i=1; i<=n; i++){
        cin >> arr[i-1];
    }
    int prev = arr[0];
    int min = INT_MAX;

    for (int i=1; i<=n-1; i++){
        differ = arr[i] - prev;
        if (differ < min){
            min = differ;
        }
        prev = arr[i];
    }
    cout << min;
    return 0;
}