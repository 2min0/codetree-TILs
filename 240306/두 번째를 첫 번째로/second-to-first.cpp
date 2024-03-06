#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    string x;
    cin >> x;
    char first = x[0], second = x[1];
    for (int i=1; i<x.length(); i++){
        if (x[i] == second){
            x[i] = first;
        }
    }
    cout << x;
    return 0;
}