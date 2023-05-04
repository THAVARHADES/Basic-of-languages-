#include<iostream>
using namespace std;
int factorial(int n){
    if(n<=1){
        return 1;
    }
    return n*factorial(n-1);
}
int main(){
    int a;
    cout<<"Enter the Number"<<endl;
    cin>>a;
    cout<<"The factorial of "<<a<<"is \n"<<factorial(a)<<endl;
    return 0;
}
/*int fib(int n){
    if(n<2){
        return n;
    }
    return fib(n-2)+fib(n-1);
}
int factorial(int n){
    if(n<=1){
        return 1;
    }
    return n*factorial(n-1);
}
int main(){
    int a;
    cout<<"Enter the number"<<endl;
    cin>>a;
    cout<<"the term in fibonacci sequence at poistion is"<<a<<"is"<<fib(a)<<endl;
    return 0;
}*/