#include<iostream>
using namespace std;
int main(){
    int a,b,c;
    cout<<"Enter the value of a\t"<<endl;
    cin>>a;
    cout<<"Enter the value of b\t"<<endl;
    cin>>b;
    cout<<"Enter the value of c\t"<<endl;
    cin>>c;
    if (a>b)
    {
        if(a>c)
        {
            cout<<"A is biggest number";
        }
        else
        {
            cout<<"C is biggest";
        }
    }
    else
    {
        if(b>c)
        {
            cout<<"B is biggest";
        }
        else
        {
            cout<<"C is biggest";
        }
    }
    return 0;
}