
#include <iostream>
#include <vector>

#define fastio ios_base::sync_with_stdio(0); cin.tie(0);
#define print std::cout <<
#define end << endl;
#define vi vector<int>
#define elif else if
#define into cin >>

using namespace std;

int main () {
    fastio;
    vi topFloor = vi{};
    vi bottomFloor = vi{};

    int tiles = 0;
    into tiles;

    for(int i = 0; i < tiles; i++) {
        int number = 0;
        into number;
        topFloor.push_back(number);
    }
    for(int i = 0; i < tiles; i++) {
        int number = 0;
        into number;
        bottomFloor.push_back(number);
    }
    topFloor.push_back(0);
    bottomFloor.push_back(0);

    int sticks = 0; // sticks used inside

    // check top floor with next oreo
    for(int i = 0; i < topFloor.size()-1; i++) {
        int element = topFloor.at(i);
        int nextElement = topFloor.at(i+1);

        if(element == 1) {
            sticks += 3;
        }
        if (element == 1 && nextElement==1) {
            sticks -=2;
        }
    }

    // check bottom floor with next oreo
    for(int i = 0; i < bottomFloor.size()-1; i++) {
        int element = bottomFloor.at(i);
        int nextElement = bottomFloor.at(i+1);

        if(element == 1) {
            sticks += 3;
        }
        if (element == 1 && nextElement==1) {
            sticks -=2;
        }
    }


    for(int i = 0; i < bottomFloor.size()-1; i++) {
        if (topFloor.at(i) == 1 and (i % 2 == 0 or i == 0)) {
            if (topFloor.at(i) == bottomFloor.at(i)) {
                sticks -= 2;
            }
        }
    }

    print sticks end


}