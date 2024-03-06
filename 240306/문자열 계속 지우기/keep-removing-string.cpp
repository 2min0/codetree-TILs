#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    string a, b;
    cin >> a >> b;
    int len_b = b.length();

    while (true){
        int find_index = a.find(b);
        if (find_index != string::npos){
            a.erase(find_index, len_b);
        }
        else{
            cout << a;
            break;
        }
    }
    
    return 0;
}