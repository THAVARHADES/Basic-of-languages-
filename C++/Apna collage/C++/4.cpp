#include<iostream>
using namespace std;
int main(){
    /*int a;
    cout<<"Enter the number of column";
    cin>>a;
    for(int i=0;i<a;i++)
    {
        cout<<"*******"<<endl;
    }*/
    /*int row,col;//
    cin>>row>>col;
    for(int i=1;i<=row;i++){
        for(int j=1;j<=col;j++){
            cout<<"@";
        }
    cout<<endl;       
    }*/
    int row,col;
    cin>>row>>col;
    for(int i=1;i<=row;i++){
        for(int j=1;j<=col;j++){
            if(i==1 || i==row || j==1 || j==col){
                cout<<"*";
            }
            else{
                cout<<" ";
            }
        }    
    cout<<endl;
    }    
   return 0;
}