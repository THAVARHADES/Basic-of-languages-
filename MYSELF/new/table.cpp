#include<iostream>
using namespace std;
int main(){
    int a=1;
    int c;
    cout<<"ENTER THE TABLE NUMBER"<<endl;
    cin>>c;
    for(int i=1;i<11;i++)
    {
        a=c*i;
        cout<<c<<"X"<<i<<"="<<c*i<<endl;
    }
    return 0;  
}