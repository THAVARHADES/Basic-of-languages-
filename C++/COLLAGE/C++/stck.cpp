#include<iostream>
#include<iomanip>
using namespace std;
class stack{
    int*  arr;
    int top;
    //int n;
    public:
    stack(){
        arr = new [int n];
        top = -1;
    }
    
    void push(int x){
        if(top == n-1){
            cout<<"stackOverflow"<<endl;
            return;
        }
        top++;
        arr[top]=x;
    }
    void pop(){
        if(top==-1){
            cout<<"No Element to pop"<<endl;
        }
        top--;
    }
    int Top(){
        if (top==-1){
            cout<<"no element is stack"<<endl;
            return -1;
        }
        return arr[top];
    }
    bool empty(){
        return top == -1;
    }
};