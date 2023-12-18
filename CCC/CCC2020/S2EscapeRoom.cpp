
#include <iostream>
#include <vector>

#define print cout <<
#define endof << endl;
#define vi vector<int>

using namespace std;



struct cell{
    int X;
    int Y;
    int value;

    template <size_t rows, size_t columns>
    void getB(int X_coor, int Y_coor, int (&array)[rows][columns]) {
        X = X_coor;
        Y = Y_coor;
        value = array[X][Y];
    }
};

template <size_t rows, size_t columns>
vi AllFactors(int number, int (&array)[rows][columns], vi &toVisitNodes) {
    vector<vi> iterations = vector<vi>();


    //somehow clean this process up to get all iterations, maybe
    //get two factos, give the 1 x 3 and 3 x 1 version and continue
    // also factors have to be less than 3 or 4 mutliped
    cell first{};
    first.getB(0, 2, array);

    cell second{};
    second.getB(2, 0, array);


    toVisitNodes.push_back(first.value);
    toVisitNodes.push_back(second.value);
    // we explore the factors

    // ----

    cell third{};
    third.getB(1, 2, array);

    cell fourth{};
    fourth.getB(2, 1, array);

    cell fifth{}; // check if same value
    fifth.getB(1, 3, array);

    toVisitNodes.push_back(third.value);
    toVisitNodes.push_back(fourth.value);
    toVisitNodes.push_back(fifth.value);

    // find the recursion in this

    print third.value endof
    print fourth.value endof
    print fifth.value endof

    return vi{};
}

int main () {

    const int rows = 3;
    const int columns = 4;

    int outputs[rows][columns] = {{3, 10, 8, 14},
                                  {1, 11,12, 12},
                                  {6,  2, 3,  9}};


    cell StartingLocation;
    vi visitedNodes = vi{};
    vi toVisitNodes = vi{};

    StartingLocation.X = 0;
    StartingLocation.Y = 0;
    StartingLocation.value = outputs[StartingLocation.X][StartingLocation.Y];

    // Put the StartingLocation.value into visitied Nodes
    vi result = AllFactors(StartingLocation.value, outputs, toVisitNodes);



    //print StartingLocation.value endof
    return 0; // has to be deleted if this doesn't fucking work.
}