#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    string x;
    getline(cin, x);
    char y;
    cin >> y;
    int cnt = 0;
    for (int i=0; i<x.length(); i++){
        if (x[i]==y){
            cnt ++;
        }
    }
    cout << cnt;
    return 0;
}