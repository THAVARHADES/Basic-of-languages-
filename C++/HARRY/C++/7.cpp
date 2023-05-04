#include<iostream>
using namespace std;
int main(){
    
    
    
    //********float,double and long double LITERALs******* 
    //float d=34.4;
    //long double e=34.4;
    //cout<<"THE Size of 34.4 is"<<sizeof(34.4)<<endl;
    //cout<<"THE Size of 34.4F is"<<sizeof(34.4f)<<endl;
    //cout<<"THE Size of 34.4f is"<<sizeof(34.4F)<<endl;
    //cout<<"THE Size of 34.4L is"<<sizeof(34.4l)<<endl;
    //cout<<"THE Size of 34.4l is"<<sizeof(34.4L)<<endl;
    //cout<<"THE VLAUE OF d is "<<d<<endl<<"THE VALUE OF e is "<<e;
    //**********Refernce  Variable**********
    //float x=455;
    //float & y = x;
    //cout<<x<<endl;
    //cout<<y<<endl;
    
    //*********Typecasting*****************
    int a=45;
    float b=45.67;
    //cout<<"The Value of a is "<<(float)a<<endl;
    //cout<<"The Value of b is "<<int(b);
    int c=int (b);
    cout<<"The Expression is "<<a+b<<endl;
    cout<<"The Expression is "<<a+int(b)<<endl;
    cout<<"The Expression is "<<a+(int)b;
    return 0;
}