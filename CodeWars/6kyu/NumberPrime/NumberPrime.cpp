

#include <iostream>

using namespace std;

// find for random and negative numbers

string primeNumber(unsigned short number);

int main() {
    unsigned short input = 13;
    cout << primeNumber(input) << endl;
}

string primeNumber(unsigned short number) {
    // false if not prime
    // true if prime
    unsigned short limit = number / 2;

    for(unsigned short i = 2; i <= limit; i++) {
        if (number % i == 0) {
            return "false";
        }
    }
    return "true";
}

