
#include <iostream>

using namespace std;


int main () {
    int amount = 0;
    cin >> amount;
    int ways = 0;

    // check all 4's
    ways = (amount % 4 == 0) ? (ways + 1) : 0; // condition ? value: othervalue;

    // check all 5's
    ways = (amount % 5 == 0) ? (ways + 1) : 0;

    // check interwining

    for ( int i = 1; i <= amount/ 4; i++) {
        amount -= 4;
        if(amount%5==0){
            ways+=1;
        }
    }

    cout << ways << endl;
}