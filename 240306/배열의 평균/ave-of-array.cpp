#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int arr[2][4] = {};
    double mean;
    for (int i=0; i<=1; i++){
        for (int j=0; j<=3; j++){
            cin >> arr[i][j];
        }
    }
    cout << fixed;
    cout.precision(1);

    for (int i=0; i<=1; i++){
        int sum = 0;
        for (int j=0; j<=3; j++){
            sum += arr[i][j];
        }
        mean = double(sum)/4;
        cout << mean << " ";
    }
    cout << endl;
    for (int j=0; j<=3; j++){
        int sum = 0;
        for (int i=0; i<=1; i++){
            sum += arr[i][j];
        }
        double mean2 = double(sum)/2;
        cout << mean2 << " ";
    }
    cout << endl;
    int sum = 0;
    for (int j=0; j<=3; j++){
        for (int i=0; i<=1; i++){
            sum += arr[i][j];
        }
    }
    double mean3 = double(sum)/8;
    cout << mean3 << " ";
    return 0;
}