#include<iostream>
#include<math.h>
using namespace std;
/*bool isPrime(int num)
{
    for(int i=2;i<=sqrt(num);i++)
        if(num%i==0){
        return false;
        }
        return true;
}
int main(){
    int a,b;
    cin>>a>>b;
    for(int i=a;i<=b;i++){
        if(isPrime(i))
        cout<<i<<endl;
    }
    return 0;
}*/
/*******************Fibacci Sequence*****/
/*void fib(int n){
    int t1=0;
    int t2=1;
    int nextterm;
    for (int i=1;i<=n;i++){
        cout<<t1<<endl;
        nextterm=t1+t2;
        t1=t2;
        t2=nextterm;
    }
}
int main(){
    int n;
    cin>>n;
    fib(n);
    return 0;
}*/
int factorail(int n){
    if(n<=1){
        return 1;
    }
    else{
    return n*factorail(n-1);
    }
}
int main(){
    int a;
    cout<<"Enter the Number"<<endl;
    cin>>a;
    cout<<factorail(a)<<endl;
    return 0;
}