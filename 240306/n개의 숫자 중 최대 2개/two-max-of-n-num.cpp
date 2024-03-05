#include <iostream>
#include <climits>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int N;
    cin >> N;
    int first = INT_MIN;
    int second = INT_MIN;
    int third = INT_MIN;
    for (int n=1; n<=N; n++){
        int x;
        cin >> x;

        if (x > third){
            if (x > second){
                if (x > first){
                    third = second;
                    second = first;
                    first = x;
                }
                else{
                    third = second;
                    second = x;
                }
            }
            else{
                third = x;
            }
            
        }
    }
    cout << first << " " << second;
    return 0;
}