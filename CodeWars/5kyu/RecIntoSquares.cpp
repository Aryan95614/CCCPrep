
#include <iostream>
#include <vector>
#include <string>

// Solved in Python
using namespace std;

typedef unsigned long long ull;


#include <vector>
#include <iostream>
#include <string>

using namespace std;


class SumFct
{
public:
    static unsigned long long sum(vector<unsigned long long> allSums) {
        unsigned long long value = 0;

        for(int element: allSums) {
            value+=element;
        }

        return value;
    }
    static ull perimeter(int n){
        if (n==1)
            return 1;
        else if(n==2)
            return 2;
        else if(n==3)
            return 4;

        vector<unsigned long long> fibSums = {1, 1};
        unsigned long long index = 1;

        for(int i = 0; i < n-1; i++) {
            unsigned long long nextValue = fibSums.at(index) + fibSums.at(index-1);
            fibSums.push_back(nextValue);
            index+=1;

        }

        fibSums.push_back(fibSums.at(fibSums.size()-1) + fibSums.at(fibSums.size()-2));


        return 4*sum(fibSums);
    };
};

// 14098308

int main() {


    cout << SumFct::perimeter(5) << endl;



    return 0;
}
// 2811767184
// 213265164688