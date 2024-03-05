#include <iostream>
#include <climits>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int max_val = INT_MIN;
    int min_val = INT_MAX;
    for (int i =1; i<=100; i++){
        int n;
        cin >> n;

        if (n==999 || n==-999){
            cout << max_val << " " << min_val;
            break;
        }
        else{
            if (n <= min_val){
                min_val = n;
            }
            if (n >= max_val) {
                max_val = n;
            }
        }

    }
    return 0;
}