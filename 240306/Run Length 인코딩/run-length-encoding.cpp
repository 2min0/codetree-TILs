#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    string x;
    cin >> x;
    int len = x.length();
    string output = "";
    if (len == 1){
        cout << 2 << endl << x << 1;
    }
    else{
        char prev = x[0];
        int cnt = 1;
        for (int i = 1; i<len; i++){
            if (i == len-1){
                if (x[i] == prev){
                cnt +=1;
                output += prev;
                output += to_string(cnt);
                }
            else{
                output += prev;
                output += to_string(cnt);
                output += x[i];
                output += to_string(1);
            }
            }
            else{
            if (x[i] == prev){
                cnt +=1;
            }
            else{
                output += prev;
                output += to_string(cnt);
                prev = x[i];
                cnt = 1;
            }
            }
        }
        cout << output.length() << endl << output;
    }
    
    return 0;
}