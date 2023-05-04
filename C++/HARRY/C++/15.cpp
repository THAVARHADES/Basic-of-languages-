#include<iostream>
using namespace std;
/******Function prototype*****/
//type funcation-name(arguments);
int sum(int a, int b){
    int c=a+b;
    return c;
};
void g(void);
int main(){
    int num1,num2;
    cout<<"enter the num1"<<endl;
    cin>>num1;
    cout<<"enter the num2"<<endl;
    cin>>num2;
    g();
    cout<<"The sum is"<<sum(num1,num2);
void g(){  
    cout<<"\nHello,Good Morning";
}
    return 0;
}