#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    double n;
    cin >> n;
    if (n>=1.){
        cout << "High";
    }
    else if (n>=0.5){
        cout << "Middle";
    }
    else{
        cout << "Low";
    }
    return 0;
}