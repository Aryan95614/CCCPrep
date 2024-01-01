
#include <numeric>
#include <iostream>
#include <vector>
#include <string>

using namespace std;

vector<int> getPrimeFactors(int Number) {
    vector<int> total;

    int totalPrimes = 0;

    for (int i = 2; i <= Number / 2 + 1; i++) {
        total.push_back(i);
    }

    for(int factor = 2; factor != 7; factor++) {

        if (Number % factor == 0) {
            totalPrimes += 1;

            for (int i = factor; i < total.size(); i++)
                if (total[i] % factor == 0)
                    total[i] = 0;

        }
    }
    cout << totalPrimes << "Nigga" << endl;



    return total;
}

int main() {

    int lowerLimit = 500;
    int higherLimit = 600;

    vector<int> totalNumbers;

    for (int element: getPrimeFactors(567)) {
        cout << element << endl;
    }


    return 0;
}