#include<iostream>
using namespace std;
int main(){
    int a,b;
    cout<<"Enter two number"<<endl;
    cin>>a>>b;
    char c;
    cout<<"Enter the operator"<<endl;
    cin>>c;
    switch(c)
    {
    case '+':
        cout<<"a+b\n"<<a+b;
        break;
    case '-':
        cout<<"a-b\n"<<a-b;
        break;
    case '/':
        cout<<"a/b\n"<<a/b;
        break;
    case '*':
        cout<<"a*b\n"<<a*b;
        break;
    
    default:
    
        cout<<"Another operator";
    }
    return 0;
}