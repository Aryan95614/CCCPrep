
//
// Created by aryan on 2023-10-18.
//

#include <iostream>
#include <vector>
#include <algorithm>
#include<iomanip>
#include <unistd.h>

using namespace std;

#define fastio ios_base::sync_with_stdio(0);
#define vi vector<int>
#define print cout <<
#define newline cout << endl;

void printarray(int example[], int size) {
    for (int i = 0; i < size; i++) {
        std::cout << example[i] << " " << std::flush;
    }
}

vi subsize(int vector1[], int size, int starting) {

    if (starting < size) {
        vi temp = vi{};
        for (int i = 0; i < size; i++) {
            temp.push_back(vector1[i + starting]);
        }
        return temp;
    }

    return vi{};

}

int asymmetric(int arr[], int size) {
    int value = 0;
    int limit;


    if (size == 1) {
        return 0;
    } else {
        limit = size / 2 ? (size % 2 == 0) : ((size - 1) / 2);
    }


    for (int i = 0; i < limit; i++) {

        value += abs(arr[i] - arr[size - i - 1]);
    }

    return value;


}

int main() {
    fastio;

    int numMountains;
    cin >> numMountains;
    vi heights = vi{};//vi{3, 1, 4, 1, 5, 9, 2};

    string answer;
    cin >> ws;
    getline(cin, answer);

    answer.push_back(' ');
    answer.push_back('0');

    char delim = ' ';


    for (;;){//int i = 0; i <numMountains;i++) {
        // Split the answer string by delimiter
        vector<int> results;
        stringstream ss(answer);

        string token;
        while (getline(ss, token, delim)) {
            int it = stoi(token);
            results.push_back(it);
        }

        // Ensure we have at least two values
        if (results.size() <= 2) {
            break;
        }
        int input = results[0];

        // Remove processed part of the answer string
        answer = answer.substr(answer.find(delim) + 1);

        heights.push_back(input);

    }
    vi outputs = vi{0};

    int bottom[numMountains-1];
    int bottomSize = sizeof(bottom)/sizeof(bottom[0]);



    for (int i = 0; i < bottomSize; i++) {
        bottom[i] = abs(outputs[i+1] - outputs[i]);

    }

    for (int element: bottom) {
        cout << element << " " << std::flush;
    }

    return 0;
}