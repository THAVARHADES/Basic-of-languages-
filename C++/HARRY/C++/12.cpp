#include<iostream>
using namespace std;
int main (){
    //Pointers:= Data type which holds the address of other data typr
    int a=3;
    int* b=&a;
    
    
    // &:= Shows Address of Operator
    cout<<"The Address of a\t"<<&a<<endl;
    cout<<"The address of a\t"<<b<<endl;
    
    
    // *:=Shows value of operator
    cout<<"The Value of Operator\t"<<*b<<endl;
    
    
    
    //Pointer to pointer
    int** c=&b;
    cout<<"The Adress of b\t"<<&b<<endl;
    cout<<"The Adress of b\t"<<c<<endl;
    cout<<"The Value at address value_at(value_at(c)) is "<<**c<<endl;
    return 0;
}