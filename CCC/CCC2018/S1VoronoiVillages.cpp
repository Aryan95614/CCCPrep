//
// Created by aryan on 2023-10-18.
//

#include <iostream>
#include <vector>
#include <algorithm>
#include <bits/stdc++.h>
#include<iomanip>

using namespace std;

#define fastio ios_base::sync_with_stdio(0); cin.tie(0);
#define vi vector<double>
#define into cin >>
#define print printf

int main () {
    fastio;

    int numVillages;
    into numVillages;
    vi neighbourhood;


    for (int i = 0; i < numVillages; i++) {
        double value;
        into value;
        neighbourhood.push_back(value);
    }


    sort(neighbourhood.begin(), neighbourhood.end());

    vi differences = vi{};

    double element = 1e9;

    for (int i = 1; i < neighbourhood.size()-1; i++) {
        double previous = neighbourhood.at(i-1);
        double current = neighbourhood.at(i);
        double next = neighbourhood.at(i+1);

        double first = previous + ((current - previous)/2);
        double second = current+ ((next - current)/2);

        double result = second - first;

        if (result < element) {
            element = result;
        }

    }


    element = round(element * 10)/10;
    //cout << element << endl;
    print("%.1f", element);

}