
#include <vector>

#include <iostream>
using namespace std;

struct particle{
    int pos_x;
    int pos_y;
    int vel_x;
    int vel_y;

    void move() {
        pos_x += vel_x;
        pos_y += vel_y;
    }
};

bool check_collision(particle p1, particle p2) {
    if ((p1.pos_x == p2.pos_x) && (p1.pos_y == p2.pos_y))
        return true;
    return false;
}
int main() {
    int x, y, n;
    cin >> x >> y >> n;

    bool isClicked = false;
    int millseconds = 0;

    vector<particle> particles = vector<particle>();

    for (int i = 0; i < n; i++) {
        int xx, yy, vix, viy;
        cin >> xx >> yy >> vix >> viy;
        particle part;
        part.pos_x = xx;
        part.pos_y = yy;
        part.vel_x = vix;
        part.vel_y = viy;

        particles.push_back(part);
    }
    while(!isClicked){
        for(int i = 0; i < particles.size(); i++) {
            for(int j = 0; j < particles.size(); j++) {
                isClicked = check_collision(particles[i], particles[j]);
                if (isClicked){
                    cout << millseconds << endl;
                    return 0;
                }
            }
        }
        for (particle part : particles) {
            part.move();
        }
        millseconds+=1;
        if (millseconds > 1000){
            cout << "No Reaction" << endl;
            return 0;
        }
    }

}