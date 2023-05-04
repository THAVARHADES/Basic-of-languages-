#include<iostream>
using namespace std;
struct employee 
{
    int eId;
    char favChar;
    float salary;
};
union money
{
    int rice;
    char car;
    float pounds;
};
int main(){
    /******************/
    struct employee harry;
    harry.eId=1;
    harry.favChar='c';
    harry.salary=120000;
    cout<<"The Value is "<<harry.eId<<endl;    
    cout<<"The Value is "<<harry.salary<<endl;
    cout<<"The Value is "<<harry.favChar<<endl;
    /*union money m1;
    m1.rice=34;
    m1.car='c';
    cout<<m1.car;*/
    /*enum Meal{breakfast,lunch,dinner};
    cout<<breakfast;
    cout<<lunch;
    cout<<dinner;*/
    return 0;
}    