#include<iostream>
using namespace std;
int fact(int n){
    int factorial=1;
    for(int i=2;i<=n;i++){
    factorial=factorial*i;
    }
    return factorial;
}
int main(){
    int n;
    cout<<"Enter the value of n"<<endl;
    cin>>n;
    int r;          
    cout<<"Enter the value of r"<<endl;
    cin>>r;
    int ans;
    ans=fact(n)/(fact(r)*fact(n-r));
    cout<<ans<<endl;
    return 0;
}