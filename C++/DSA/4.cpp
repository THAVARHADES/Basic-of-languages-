#include<iostream>
#include<string>
using namespace std;
void fun(int A[],int n)
{
    for(int i=0;i<n ;i++) 
    {
        cout<<A[i]<<endl;  
    }
}
int main(){
    int A[5]={23,34,45,23,34};
    A[0]=9;
    fun(A,5);
    cout<<A<<endl;
    return 0;
}