
//
// Created by aryan on 2023-10-18.
//

#include <iostream>
#include <vector>
#include <algorithm>
#include<iomanip>
#include <unistd.h>

using namespace std;

#define fastio ios_base::sync_with_stdio(0); cin.tie(0);
#define vi vector<int>
#define into cin >>
#define print cout <<

vi subsize(vi& vector1, int size, int starting) {

    if (starting < vector1.size()) {
        vi temp = vi{};
        for(int i = 0; i < size; i++) {
            temp.push_back(vector1.at(i+starting));
        }
        return temp;
    }

    return vi{};

}

int asymmetric(vi subset) {
    int value = 0;
    int size = (int)subset.size();
    if (size == 1) {
        return 0;
    }

    if (size % 2 == 1) {

        for(int i = 0; i < (size-1)/2;i++ ) {

            value += abs(subset.at(i) - subset.at(size-i-1));        }

        return value;
    } else {
        for(int i = 0; i < size/2;i++ ) {

            value += abs(subset.at(i) - subset.at(size-i-1));      }

        return value;
    }


}

int getLimit(int number, int limit) {
    return limit-number+1;
}

int main () {
    fastio;

    int numMountains;
    into numMountains;
    vi heights = vi{};//vi{3, 1, 4, 1, 5, 9, 2};

    string answer;
    into answer;

    answer.push_back(' ');
    answer.push_back('0');

    char delim = ' ';
    for (int i = 0; i <10;i++) {
        // Split the answer string by delimiter
        vector<int> results;
        stringstream ss(answer);

        string token;
        while (getline(ss, token, delim)) {
            results.push_back(stoi(token));
        }

        // Ensure we have at least two values
        if (results.size() == 2) {
            break;
        }

        int input = results[0];
        int size = results[1];

        // Remove processed part of the answer string
        answer = answer.substr(answer.find(delim) + 1);

        heights.push_back(input);
        //cout << inputs.at(i) << endl;
    }

    for (int value : heights) {
        cout << value << endl;
    }


    vi outputs = vi{0};



    for (int sizes = 2; sizes < numMountains; sizes++) {
        vi temp1 = vi{};
        for (int startings = 0; startings < getLimit(sizes, numMountains); startings += 1) {
            int element = 0;
            vi temp = subsize(heights, sizes, startings);
            temp1.push_back(asymmetric(temp));
        }
        outputs.push_back(*min_element(temp1.begin(), temp1.end()));
    }

    outputs.push_back(asymmetric(heights));


    for (int element: outputs) {
        cout << element << " " << std::flush;
    }

}