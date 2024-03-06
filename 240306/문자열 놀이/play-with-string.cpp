#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    string s;
    int q, type, a, b;
    cin >> s >> q;
    char c, d;

    for (int i=1; i <=q; i++){
        cin >> type;
        if (type == 1){
            cin >> a >> b;
            char temp = s[a-1];
            s[a-1] = s[b-1];
            s[b-1] = temp;
        }
        else{
            cin >> c >> d;
            for (int j=0; j<s.length(); j++){
                if (s[j] == c){
                    s[j] = d;
                }
            }
        }
        cout << s << endl;
    }
    return 0;
}