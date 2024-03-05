#include <iostream>

using namespace std;

int main() {
	// 변수 선언 및 입력
	int n;
	cin >> n;
	bool satisfied = false;
	
	for(int i = 2; i < n; i++) {
		// n의 약수가 있다면 합성수입니다.
		if(n % i == 0){
			satisfied = true;
            break;
        }
	}

	//출력
	if(satisfied == true)
		cout << "C";
	else
		cout << "N";
	
    return 0;
}