#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    cin >> n;
    for (int i=1; i<=n; i++){
        if (i==1){
            for (int j=1; j<=n; j++){
                cout << "* ";
            }
        }
        else if (i==n){
            for (int j=1; j<=n; j++){
                cout << "* ";
            }
        }
        else{
            for (int j=1; j <= n; j++){
                if (j==1 || j ==n){
                    cout << "* "; 
                }
                else if (j <= i-1){
                    cout << "* ";
                }
                else{
                    cout << "  ";
                }
            }
        }
        cout << endl;
    }
    return 0;
}