/*#include<iostream>
using namespace std;
int add(int a,int b){
    int c;
    c=a+b;
    return c;
}
int main(){
    int a,b,c;
    cout<<"Enter the Value of A"<<endl;
    cin>>a;
    cout<<"Enter the Value of B"<<endl;
    cin>>b;
    c=add(a,b);
    cout<<"The Sum is"<<c;
    return 0;
}*/
//********Parameter Passing through pointers
#include<iostream>
using namespace std;
void swap(int *a,int *b){
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}
int main(){
    int x,y;
    x=10;
    y=5;
    swap(x,y);
    cout<<x<<endl;
    cout<<y;
    return 0;
}