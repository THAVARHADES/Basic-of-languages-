#include<iostream>
using namespace std;
/*int sum(int a, int b){
    cout<<"Using funcation with 2 arguments"<<endl  ;
    return a+b;
}
int sum(int a, int b,int c){
    cout<<"using funcation with 3 arguments"<<endl;
    return a+b+c;
}
int main(){
    cout<<"the sum of 3 and 6 is"<<sum(3,6)<<endl;
    cout<<"the sum of 3,7and6 is "<<sum(3,7,6);
    return 0;
}*/
/*******Calculate the volume oof cylinder*/
int volume(double r, int h){
    return(3.14*r*r*h);
}
/*****Calculate volume of a cube*/
int volume(int a){
    return (a*a*a);
}
int volume(int l,int b, int h){
    return (l*b*h);
}
int main(){
    cout<<"The volume of cylinder\n"<<volume(3,5)<<endl;
    cout<<"The volume of cube\n"<<volume(3)<<endl;
    cout<<"The volume of cuboid\n"<<volume(3,6,5)<<endl;
    return 0;
}