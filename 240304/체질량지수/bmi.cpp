#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int height, weight;
    cin >> height >> weight;
    int bmi = weight / (0.0001*height*height);
    cout << bmi;
    if (bmi >= 25){
        cout << endl << "Obesity";
    }
    return 0;
}