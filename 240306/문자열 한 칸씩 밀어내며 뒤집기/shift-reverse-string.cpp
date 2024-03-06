#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    string x;
    int q, request;
    cin >> x >> q;

    for (int i=1; i<=q; i++){
        cin >> request;
        if (request == 1){
            x = x.substr(1 ) + x[0];
        }
        else if (request == 2){
            x = x[x.length()-1] + x.substr(0, x.length()-1);
        }
        else{
            string y = "";
            for (int j = 0; j < x.length(); j++){
                y += x[x.length()-1-j];
            }
            x = y;
        }
        cout << x << endl;
    }
    return 0;
}