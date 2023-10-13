
#include <iostream>

using namespace std;

int oddChange(int number);
int evenChange(int number);

int main() {
    int number = 1;
    int iterator = 0;


    cin >> number;

    while (number != 1) {
        cout << number << endl;
        if (number % 2 == 0) {
            number = evenChange(number);
        } else {
            number = oddChange(number);
        }

        iterator += 1;
    }

    cout << iterator << endl;

    return 0;
}

int oddChange(int number) {return (3*(number))+1;}
int evenChange(int number) {return (number/2);}