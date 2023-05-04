#include<iostream>
using namespace std;
struct rectangle
{
    int lenght;
    int breath;
};
void initalize(struct rectangle *r,int l,int b)
{
   r->lenght=l;
   r->breath=b;
}
int area(struct rectangle r)
{
    return r.lenght*r.breath;
}
void changelenght(struct rectangle *r,int l)
{
    r->lenght=l;
}
int main(){
    struct rectangle;
    initalize(&r,10,5);
    area(r);
    changelenght(&r,20);
    return 0;
}