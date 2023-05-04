#include<iostream>
using namespace std;
/*int sum(int a,int b){
    int c=a+b;
    return c;
}*/
/*********THIS WILL NOT SWAP VALUE*/
/*int main(){
    cout<<"THE SUM OF NUMBER"<<sum(4,5)<<endl;    
    return 0;
}*/
/********THIS will not work to swap values***/
/*void swap(int a,int b){
    int temp=a;
    a=b;
    b=temp;
} 

int main(){
    int a=4,b=5;
    cout<<"THE VALUE OF A IS "<<a<<"THE VALUE OF B IS "<<b<<endl;
    swap(a,b);
    cout<<"THE VALUE OF A IS "<<a<<"THE VALUE OF B IS "<<b<<endl;
    return 0;
}*/
void swap(int* a,int* b){
    int temp=*a;
    *a=*b;
    *b=temp;
} 

int main(){
    int x=4,y=5;
    cout<<"THE VALUE OF x IS "<<x<<"THE VALUE OF y IS "<<y<<endl;
    swap(x,y);
    cout<<"THE VALUE OF x IS "<<x<<"THE VALUE OF y IS "<<y<<endl;
    return 0;
}