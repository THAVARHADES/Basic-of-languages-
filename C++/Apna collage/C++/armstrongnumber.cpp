#include<iostream>
#include<math.h>
using namespace std;
int main(){
    int n;
    cout<<"Enter the Number";
    cin>>n;
    int sum;
    int orginal=n;
    while(n>0){
        int lastdigit=n%10;
        sum+=pow(lastdigit,3); 
    }
    if(sum==orginal){
        cout<<"Number is Armstrong";
    }
    else{
        cout<<"kuch bhi";
    }
    return 0;
}