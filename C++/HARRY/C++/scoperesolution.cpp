#include<iostream>
using namespace std;
int a =45;
int main(){
    int a,b,c;
    int sum;
    cout<<"ENTER THE VALUE a:"<<endl;
    cin>>a;
    cout<<"ENTER THE VALUE b:"<<endl;
    cin>>b;
    cout<<"ENTER THE VALUE c:"<<endl;
    cin>>c;
    sum=a+b+c;
    cout<<"SUM OF THREE NUMBER\n"<<sum<<endl;
    cout<<"VALUE OF GLOBAL a is:"<<::a;
    
}