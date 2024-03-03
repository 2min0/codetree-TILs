#include <iostream>
#include <string>
using namespace std;

int main() {
    int weight = 13;
    float ratio = 0.165;
    cout << fixed;
    cout.precision(6);
    cout << weight << " * " << ratio << " = " << weight * ratio;
	return 0;
}