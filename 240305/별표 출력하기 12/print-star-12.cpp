#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    cin >> n;
    for (int i = 1; i<=(2* (n/2)); i++){
        if (i==1){
            for (int j=1; j<=n;j++){
                cout << "* ";
            }
        }
        else if (i%2 == 0){
            for (int j = 1; j<=n;j++){
                if (j<i){
                    cout <<"  ";
                }
                else if (j%2 ==1){
                    cout << "  ";
                }
                else{
                    cout << "* ";
                }
            }
        }
        else{
            for (int j = 1;j<=n;j++){
                if (j<i){
                    cout <<"  ";
                }
                else if (j%2==0){
                    cout<< "* ";
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