#include <iostream>
#include "Cuboid.h"

using namespace std;

int main()
{
   // cout << "Hello world!" << endl;
    Cuboid c1;
    Cuboid c2;
    Cuboid c3;
    c1.set(2,3,4);
    c2.set(4,5,6);
    c3=c1+c2;
    cout << "The surface area of cuboid 1: " << c1.get_SurfaceArea()<< endl;
    cout << "The surface area of cuboid 2: " << c2.get_SurfaceArea()<< endl;
    cout << "The surface area of cuboid 3: " << c3.get_SurfaceArea()<< endl;
    return 0;
}
