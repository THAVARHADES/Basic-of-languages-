#include<iostream>
using namespace std;
void func(int A[],int n){
    for(int i=0;i<n;i++){
        cout<<A[i]<<endl;
    }
}
int main(){
    int A[5]={23,98,32,56,34};
    func(A,5);
}
