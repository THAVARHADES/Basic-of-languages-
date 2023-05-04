#include<iostream>
#include<stdio.h>
using namespace std;

class Student
{
        int roll;
        char name[25];
    public:
        void getdata()
        {
                cout<<"\n -----------------------------------------";
                cout<<"\n Enter Roll No.            : ";
                cin>>roll;
                cout<<"\n Enter Student Name        : ";
                cin>>name;
        }
        void putdata()
        {
                cout<<"\n -----------------------------------------";
                cout<<"\n **** Student Marklist ****";
                cout<<"\n -----------------------------------------";
                cout<<"\n Roll No.             :  "<<roll;
                cout<<"\n Student Name         :  "<<name<<endl;
        }
};
class Test : public Student    
{
    public:
        int sub1, sub2, sub3, sub4, sub5;
        float avg, tot;
    public:
        void accept_data()
        {
                getdata();
                cout<<"\n Enter Marks for Subject 1 : ";
                cin>>sub1;
                cout<<"\n Enter Marks for Subject 2 : ";
                cin>>sub2;
                cout<<"\n Enter Marks for Subject 3 : ";
                cin>>sub3;
                cout<<"\n Enter Marks for Subject 4 : ";
                cin>>sub4;
                cout<<"\n Enter Marks for Subject 5 : ";
                cin>>sub5;
        }
        void display_data()
        {
                putdata();
                cout<<"\n Marks of Subject 1   :  "<<sub1;
                cout<<"\n Marks of Subject 2   :  "<<sub2;
                cout<<"\n Marks of Subject 3   :  "<<sub3;
                cout<<"\n Marks of Subject 4   :  "<<sub4;
                cout<<"\n Marks of Subject 5   :  "<<sub5;
              
        }
};
class Result : public Test      
{
    public:
        void calculate ()
        {
                tot=(sub1+sub2+sub3+sub4+sub5);
                avg = tot/5.0;
                cout<<"\n\n Total marks     :  "<<tot;
                cout<<"\n ----------------------------------------- \n";
                cout<<"\n\n Average     :  "<<avg;
                cout<<"\n ----------------------------------------- \n";
        }
};
int main()
{
        Result str;     
        int cnt, i;
        cout<<"\n Enter No. of Students You Want? : ";
        cin>>cnt;
        for(i=0; i<cnt; i++)
        {
                str.accept_data();
                str.display_data();
                str.calculate();
        }
        return 0;
}