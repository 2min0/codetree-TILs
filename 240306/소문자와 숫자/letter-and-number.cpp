#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    string x;
    cin >> x;
    for (int i=0; i<x.length(); i++){
        if (isalpha(x[i])){
            if (int(x[i]) < 97){
                cout << char(int(x[i]) + 32);
            }
            else{
                cout << x[i];
            }
        }
        else if (isdigit(x[i])){
            cout << x[i];
        }
    }
    return 0;
}