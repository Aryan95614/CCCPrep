//
// Created by aryan on 2023-12-29.
//
// 0 -> O
// 1 -> X
// 2 -> .

#include <iostream>
#include <vector>
#include <bits/stdc++.h>


using namespace std;

struct ticTacToe {

public:
    vector<vector<int>> arr;

    void setVector(vector<vector<int>> input) {
        // Initialize the vector with size 3x3 and fill it with zeros
        arr = input;
    }
};

bool sequenceWinnable(int element, int element1, int element2) {
    if(element == 0 || element1 == 0 || element2 == 0)
        return false;

    if(element == 1 && element1 == 1 && element2 == 2)
        return true;
    if(element == 1 && element1 == 2 && element2 == 1)
        return true;
    if(element == 2 && element1 == 1 && element2 == 1)
        return true;
    return false;
}

bool canWin(int bingo[3][3]){

    // first row across
    bool possibilities[8];

    // 3 across
    possibilities[0] = sequenceWinnable(bingo[0][0], bingo[0][1], bingo[0][2]);
    possibilities[1] = sequenceWinnable(bingo[1][0], bingo[1][1], bingo[1][2]);
    possibilities[2] = sequenceWinnable(bingo[2][0], bingo[2][1], bingo[2][2]);

    // 3 columns
    possibilities[3] = sequenceWinnable(bingo[0][0], bingo[1][0], bingo[2][0]);
    possibilities[4] = sequenceWinnable(bingo[0][1], bingo[1][1], bingo[2][1]);
    possibilities[5] = sequenceWinnable(bingo[0][2], bingo[1][2], bingo[2][2]);

    // 2 diagonals
    possibilities[6] = sequenceWinnable(bingo[0][0], bingo[1][1], bingo[2][2]);
    possibilities[7] = sequenceWinnable(bingo[0][2], bingo[1][1], bingo[2][0]);

    for (int i = 0; i < 8; i++)
        if (possibilities[i])
           return true;

    return false;

}

bool winnable(vector<vector<int>> &alls) {
    ticTacToe mall = ticTacToe();

    mall.setVector(alls);
    int array[3][3] = {{mall.arr[0][0], mall.arr[0][1], mall.arr[0][2]},
                       {mall.arr[1][0], mall.arr[1][1], mall.arr[1][2]},
                       {mall.arr[2][0], mall.arr[2][1], mall.arr[2][2]}};

    return canWin(array);
}

int main() {

    int numPuzzles = 0;
    cin >> numPuzzles;

    vector<int> wins;

    string lines[(numPuzzles*2)+numPuzzles];

    for (int i = 0; i < numPuzzles; i++) {
        string nextLine;
        cin >> nextLine;

        lines[i] = nextLine;
    }

    for(string thing: lines) {
        cout << thing << endl;
    }

    vector<vector<int>> outputs = {{1, 0, 0},
                                   {0, 2, 1},
                                   {1, 0, 1}};
    wins.push_back(winnable(outputs));







    return 0;
}