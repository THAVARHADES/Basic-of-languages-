#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    for(int i=2;i<n;i++){
        if(n%i==0){
            cout<<"Number is not prime"<<endl;
            break;
        }
        else{
            cout<<"the number is prime";
            break;
        }
    }
    return 0;
}