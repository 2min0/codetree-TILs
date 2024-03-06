#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    cin >> n;
    string x;
    string xx = "";
    int total = 0;
    for (int i=1; i<=n; i++){
        cin >> x;
        xx.append(x);
        total += x.length();
    }
    for (int i=0; i<= total-1; i++){
        if (i!=0 && i%5==0){
            cout << endl;
        }
        cout << xx[i];
    }
    return 0;
}