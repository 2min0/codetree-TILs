#include <iostream>
#include <climits>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int N;
    cin >> N;
    int arr[N]={};
    for (int i=1; i<=N; i++)
        cin >> arr[i-1];
    
    int range_idx = N;
    int selected_idx = N;
    while (selected_idx != 1){
        int max = INT_MIN;
        for (int i=0; i<=range_idx-1; i++){
            if (arr[i] > max){
                max = arr[i];
                selected_idx = i+1;
            }
        }
        cout << selected_idx << " ";
        range_idx = selected_idx-1;
    }
    return 0;
}