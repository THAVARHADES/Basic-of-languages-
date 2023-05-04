#include<iostream>
#include<stdlib.h>
using namespace std;
struct rectangle
{
    int lenght;
    int breath;
};
int main(){
    struct rectangle *p;
    p=(struct rectangle *)malloc(sizeof(struct rectangle));
    p->lenght=10;
    p->breath=10;
    cout<<p;
    return 0;
}