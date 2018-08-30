#ifndef CUBOID_H
#define CUBOID_H
#include"ThreeD.h"

class Cuboid :public ThreeD
{
    public:
        Cuboid();
        virtual ~Cuboid();

    private:

    public:
        void set(int x, int y,int z);
        int get_SurfaceArea();
        Cuboid operator+(Cuboid& c1);
};

#endif // CUBOID_H
