#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    string x, output[100] = {};
    int cnt = 0;
    string zero = "0";
    for (int i=0; i<200; i++){
        cin >> x;
        if (x == zero){
            cout << i << endl;
            cnt = i;
            break;
        }
        if (i%2==0){
            output[i/2] = x;
        }
    }
    for (int j=0; j<cnt/2+1; j++){
        cout << output[j] << endl;
    }
    return 0;
}