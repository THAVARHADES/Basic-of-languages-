#include<iostream>
using namespace std;
struct Rectangle{
    int length;
    int breadth;
};
int main(){
    struct Rectangle *p;
    p=new struct Rectangle;
    p->length=10;
    p->breadth=5;
    cout<<(*p).length<<endl;
    cout<<(*p).breadth;
    return 0;
}