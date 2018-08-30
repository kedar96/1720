#ifndef ThreeD_H
#define ThreeD_H
#include"Shape.h"

class ThreeD : public Shape
{
    public:
        ThreeD();
        virtual ~ThreeD();
        virtual int get_SurfaceArea()=0;
    protected:

    private:
};

#endif // 3D_H
