#include<iostream>
using namespace std;
int func(int n)
    {
    int  x=0;
    if(n>0)
    { 
        x++;
        return func(n-1)+n;
    }
    return 0;
}
int main()
{
    int r;
    r=func(8);
    cout<<r;
    return 0;  
}                