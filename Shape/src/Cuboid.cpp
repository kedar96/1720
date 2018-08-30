#include "Cuboid.h"

Cuboid::Cuboid()
{
    //ctor
}

Cuboid::~Cuboid()
{
    //dtor
}

int Cuboid::get_SurfaceArea(){

    return x*y*z;
}

void Cuboid::set(int x,int y,int z){
    this->x = x;
    this->y = y;
    this->z = z;
}
Cuboid Cuboid::operator+(Cuboid& c1){
    Cuboid c3;
    c3.set(  x + c1.x, y + c1.y, z + c1.z);
    return c3;
}
