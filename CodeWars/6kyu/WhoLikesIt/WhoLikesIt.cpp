//
// Created by aryan on 2023-10-13.
//

#include <iostream>
#include <string>
#include <vector>


using namespace std;

string whoLikesIt(const vector<string>& names) {

    unsigned long long size = names.size();

    if (size > 1){
        const string& firstName = names.at(0);
        const string& secondName = names.at(1);

        if (size == 2) {
            return firstName + " and " + secondName + " like this";
        } else if (size == 3) {
            const string& thirdName = names.at(2);
            return firstName + ", " + secondName + " and " + thirdName + " like this";
        } else {
            string thing = to_string((int)size-2);
            return firstName + ", " + secondName + " and " + thing + " others like this";
        }
    } else if (size == 1) {
        const string& firstName = names.at(0);

        return firstName + " likes this";
    }
    return "no one likes this";
}

int main() {

    string output = whoLikesIt({"Alex", "Jacob", "Mark", "Max"});

    cout << output << endl;
    return 0;
}
