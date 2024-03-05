#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    cin >> n;
    bool *isPrime = new bool[n+1];
    for (int i=2; i<=n; i++){
        isPrime[i] = true;
    }

    for (int i=2; i<=n;i++){
        if (isPrime[i] == true){
            for (int j=i*2; j<=n; j += i){
                isPrime[j] = false;
            }
        }
    }

    for (int i=2; i<= n; i++){
        if (isPrime[i]==true){
            cout << i << " ";
        }
    }
    return 0;
}