/*#include<iostream>
using namespace std;
struct Rectangle{
    int length;
    int bredth;
};
int main(){
    struct Rectangle r1={10,5};
    r1.length=20;
    cout<<r1.length<<endl;
    cout<<r1.bredth<<endl;
}*/
#include<iostream>
using namespace std;
struct student{
    int roll;
    char name[20];
    char dept[10];
    char address[50];
};
int main(){
    struct student s1;
    s1.roll=12;
    s1.name='Rahul';
    s1.dept='librarians';
    s1.address='pakistani';
    cout<<s1.roll<<endl;
    cout<<s1.name<<endl;
    cout<<s1.dept<<endl;
    cout<<s1.address<<endl;
    return 0;
}