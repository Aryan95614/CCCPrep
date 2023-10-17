
#include <iostream>
#include <vector>

#define fastio ios_base::sync_with_stdio(0); cin.tie(0);
#define print std::cout <<
#define end << endl;
#define vi vector<int>

using namespace std;

int main () {
    fastio;

    int tiles = 5; // triangles put in the row
    int sticks = 0; // sticks used inside

    vi topFloor =    vi{1, 1, 0, 0, 0};
    vi bottomFloor = vi{1, 0, 0, 0, 0};

    // check top floor with next oreo
    for(int i = 0; i < topFloor.size()-1; i++) {
        int element = topFloor.at(i);
        int nextElement = topFloor.at(i+1);

        if (nextElement == 1 and element == 1) {
            sticks -=2;
        }
    }
    print sticks end
    // check bottom floor with next oreo
    for(int i = 0; i < bottomFloor.size()-1; i++) {
        int element = bottomFloor.at(i);
        int nextElement = bottomFloor.at(i+1);
        if (element == 1) {
            sticks += 3;
        }
        if (nextElement == 1 and element == 1) {
            sticks -=2;
        }
    }
    print sticks end

    for(int i = 0; i < bottomFloor.size()-1; i++) {
        if (i % 2 == 0 or i == 0) {
            if (topFloor.at(i) == bottomFloor.at(i)) {
                sticks -= 2;
            }
        }
    }

    print sticks end


}