//
// Created by aryan on 2023-10-30.
//

#include <iostream>
#include <vector>
#include <bits/stdc++.h>

#define vi vector<int>
#define vii vector<vector<int>>

using namespace std;



void combinationUtil(int arr[], int data[],
                     int start, int end,
                     int index, int r)
{
    // Current combination is ready
    // to be printed, print it
    if (index == r)
    {
        for (int j = 0; j < r; j++)
            cout << data[j] << " ";
        cout << endl;
        return;
    }

    for (int i = start; i <= end &&
                        end - i + 1 >= r - index; i++)
    {
        data[index] = arr[i];
        combinationUtil(arr, data, i+1,
                        end, index+1, r);
    }
}

void printCombination(int arr[], int n, int r)
{
    // A temporary array to store
    // all combination one by one
    int data[r];

    // Print all combination using
    // temporary array 'data[]'
    combinationUtil(arr, data, 0, n-1, 0, r);
}


int[] factors(int number) {
    vi factor = vi{1};

    for( int i = 2; i < (number+1) / 2; i++ )
        if (number % i == 0)
            factor.push_back(i);

    factor.push_back(number);

    const int size = factor.size();
    int results[size];

    for (int i = 0; i < size; i++) {
        results[i] = factor.at(i);
    }


    return results;
}
int main () {
    const int rows = 3;
    const int columns = 4;

    int arr[rows][columns] = {{3, 10, 8, 14},
                              {1, 11, 12, 12},
                              {6, 2,  3,  9}};


    int goal = 10;

    factors(goal)


}