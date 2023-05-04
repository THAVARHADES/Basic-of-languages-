#include<iostream>
using namespace std;
    struct rectangle
    {
        int len;
        int brath;
    };
int main(){
    /*struct rectangle r;*/
    struct rectangle r;
    r.len=200;
    r.brath=16;
    cout<<"area of rectangle\n"<<r.len*r.brath;       
    return 0;
}
   
