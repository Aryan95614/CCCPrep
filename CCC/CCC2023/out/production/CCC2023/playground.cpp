#include <iostream>
#include <vector>
#include <string>
#include <sstream>

using namespace std;

int main() {
    string answer = "1 10 2 15 3 5 0"; // Sample input string
    char delimiter = ' ';

    vector<int> inputs;

    for (int i = 0; i < 10; i++) {
        // Split the answer string by delimiter
        vector<int> results;
        stringstream ss(answer);

        string token;
        while (getline(ss, token, delimiter)) {
            results.push_back(stoi(token));
        }

        // Ensure we have at least two values
        if (results.size() < 2) {
            cout << "Not enough values in the input string." << endl;
            return 1;
        }

        int input = results[0];
        int size = results[1];

        // Remove processed part of the answer string
        answer = answer.substr(answer.find(delimiter) + 1);

        inputs.push_back(input);
        cout << inputs.at(i) << endl;
    }

    // Print the results
    for (int value : inputs) {
        cout << inputs.at(0) << endl;
    }

    return 0;
}
