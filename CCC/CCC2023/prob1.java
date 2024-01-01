#include <iostream>
#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

bool couldWin(int arr[3]) {
    int twos = 0;
    int ones = 0;

    if (arr[0] == 1) {
        ones += 1;
    }
    if (arr[0] == 2) {
        twos += 1;
    }

    if (arr[1] == 1) {
        ones += 1;
    }
    if (arr[1] == 2) {
        twos += 1;
    }

    if (arr[2] == 1) {
        ones += 1;
    }
    if (arr[2] == 2) {
        twos += 1;
    }

    if ( ones == 2 && twos == 1) {
        return true;
    }
    return false;
}

bool possibleCombinations(int a[3][3]) {
    int possibleCombinations[8][3] = {
            {a[0][0], a[1][0], a[2][0]}, // 0
            {a[0][1], a[1][1], a[2][1]}, // 1
            {a[0][2], a[1][2], a[2][2]}, // 2
            //
            {a[0][0], a[0][1], a[0][2]}, // 3
            {a[1][0], a[1][1], a[1][2]}, // 4
            {a[2][0], a[2][1], a[2][2]}, // 5
            //
            {a[0][0], a[1][1], a[2][2]}, // 6
            {a[0][2], a[1][1], a[2][0]}, // 7

    };

    bool win = false;

    for (int i = 0; i <= 7; i++) {
        if (!win) {
            win = couldWin(a[i]);
        }
        else {
            break;

        }
    }
    return win;
}
int main() {

//    int iterations = 0;
//    cin >> iterations;

    string input1 = "xooo.xx.x";
    char choice = "x can move"[0];
    int a[3][3];

    for (int i = 0; i < 9; i++) {

    }






    bool canWin = false;



    cout << possibleCombinations(a) << endl;


}