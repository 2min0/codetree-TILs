#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    string x, y;
    cin >> x >> y;
    int x_int, y_int;
    bool change = false;

    for (int i =0; i<x.length(); i++){
        if (isdigit(x[i])==false){
            x_int = stoi(x.substr(0, i));
            change = true;
            break;
        }
    }

    if (change == false){
        x_int = stoi(x);
    }
    change = false;
    for (int i =0; i<y.length(); i++){
        if (isdigit(y[i])==false){
            y_int = stoi(y.substr(0, i));
            change = true;
            break;
        }
    }
    if (change == false){
        y_int = stoi(y);
    }
    cout << x_int + y_int;
    return 0;
}