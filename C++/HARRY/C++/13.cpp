#include<iostream>
using namespace std;
int main(){
    /*******Array Example******/
    int marks[]={23,44,67,88,99};
    /*int mathmarks[4];
    mathmarks[0]=35564; 
    mathmarks[1]=86789; 
    mathmarks[2]=33455; 
    mathmarks[3]=63537;
    cout<<"These are Maths Marks"<<endl;
    cout<<mathmarks[0]<<endl;
    cout<<mathmarks[1]<<endl;
    cout<<mathmarks[2]<<endl;
    cout<<mathmarks[3]<<endl;
    cout<<mathmarks[4]<<endl;*/
     
    cout<<"These are Marks"<<endl;
    //cout<<marks[0]<<endl;
    //cout<<marks[1]<<endl;
    /************Yor Can Change Value of Array**************/
    marks[2]=688;
    //cout<<marks[2]<<endl;
    //cout<<marks[3]<<endl;
    //cout<<marks[4]<<endl;

    /*for(int i=0;i<4;i++)
    {
        cout<<"The Value of Maths mraks\t" <<marks[i]<<endl;
    }*/
    /***************While Loops*****************/
    /*int i=0;
    while (i<5)
    {
        i++;
        cout<<"The Marks Of Mths is"<<marks[i]<<endl;
    }*/
    int i=0;
    do{
        i++;
        cout<<"The Marks are "<<marks[i]<<endl;
    }while(i<4);    
    
    return 0;
}    