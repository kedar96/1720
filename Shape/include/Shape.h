#ifndef SHAPE_H
#define SHAPE_H


class Shape
{
    public:
        Shape();
        virtual ~Shape();
        int x;
        int y;
        int z;
     public:
        virtual void set(int x,int y,int z)=0;
};

#endif // SHAPE_H
