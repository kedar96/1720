#ifndef TwoD_H
#define TwoD_H

#include"Shape.h"

class TwoD : public Shape
{
    public:
        TwoD();
        virtual ~TwoD();
        virtual int get_area()=0;

    private:
};

#endif // 2D_H
