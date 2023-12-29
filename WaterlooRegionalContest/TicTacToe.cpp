//
// Created by aryan on 2023-12-29.
//

#include "TicTacToe.h"
#include <iostream>
#include <vector>

using namespace std;

struct ticTacToe {

public:
    vector<vector<int>> arr;

    void setVector() {
        // Initialize the vector with size 3x3 and fill it with zeros
        arr = vector<vector<int>>(3, vector<int>(3, 0));
    }
};

template <size_t rows, size_t columns>
bool canWin(int arr[rows][columns]){


}

int main() {

    int numPuzzles = 0;

    ticTacToe first = ticTacToe();
    first.setVector();

    // 3 across

    // 3 top to down

    // 2 diagonals


    return 0;
}