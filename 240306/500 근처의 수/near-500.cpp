#include <iostream>
#include <climits>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int max = INT_MIN;
    int min = INT_MAX;

    for (int i=0; i<10; i++){
        int x;
        cin >> x;
        if (x < 500 && x > max)
            max = x;
        else if (x > 500 && x < min)
            min = x;
    }
    cout << max << " " << min;
    return 0;
}