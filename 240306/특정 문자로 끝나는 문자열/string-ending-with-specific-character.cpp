#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    string list[10] = {};
    string x;
    bool success = false;
    for (int i=0; i<10; i++){
        cin >> x;
        list[i] = x;
    }
    char y;
    cin >> y;
    for (int i=0; i <10; i++){
        if (list[i][list[i].length()-1] == y){
            cout << list[i] << endl;
            success = true;
        }
    }
    if (success == false){
        cout << "None";
    }
    return 0;
}