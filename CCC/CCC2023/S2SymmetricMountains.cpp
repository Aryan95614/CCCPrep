
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

vi subsize(vi &vector1, int size, int starting) {

    if (starting < vector1.size()) {
        vi temp = vi{};
        for (int i = 0; i < size; i++) {
            temp.push_back(vector1.at(i + starting));
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
    cin.ignore();
    vi heights = vi{};

    string answer;
    int index = 0;

    getline(cin, answer);
    print(answer);

    istringstream ss(answer);
    int num;

    while (ss >> num) {
        heights.push_back(num);
    }

    vi outputs = vi{0};


    int tracker = 0;
    for (int sizes = 2; sizes < numMountains; sizes++) {
        vi temp1 = vi{};

        for (int startings = 0; startings < numMountains - sizes + 1; startings += 1) {
            int element = 0;

            vi temp(heights.begin() + startings, heights.begin() + startings + sizes);

            temp1.push_back(asymmetric(temp));
        }


        outputs.push_back(*min_element(temp1.begin(), temp1.end()));
        tracker += 1;
        print tracker << std::endl;
    }

    outputs.push_back(asymmetric(heights));


    for (int element: outputs) {
        cout << element << " " << std::flush;
    }

    return 0;
}