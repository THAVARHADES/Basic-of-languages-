#include<iostream>
using namespace std;
int main(){
    int a=10;
    int &r=a;
    cout<<a<<endl;
    cout<<r++<<endl;
    cout<<r<<endl;
    cout<<a<<endl;
    cout<<r++<<endl;
    cout<<r<<endl;
    cout<<a<<endl;
    cout<<r++<<endl;
    cout<<r<<endl;
    cout<<a<<endl;
    cout<<r++<<endl;
    cout<<r<<endl;
    cout<<a<<endl;
    return 0;   
}
