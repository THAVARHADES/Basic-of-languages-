/*#include<iostream>
using namespace std;
struct Rectangle{
    int length;
    int breadth;
};
int main(){
    struct Rectangle r={10,23};
    struct Rectangle *p=&r;
    p->length=15;
    cout<<r.length<<"\n"<<r.breadth;
    return 0;
}*/
struct Rectangle{
    int length;
    int breadth;
};
int main(){
    struct Rectangle *p;
    p=new struct Rectangle;
    p->length=10;
    p->breadth=87;
    cout<<   
    return 0;
}