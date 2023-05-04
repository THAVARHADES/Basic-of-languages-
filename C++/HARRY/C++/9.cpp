#include<iostream>
using namespace std;
int main(){
    /*************If -ELse structure**/
    
    int age;
    cout<<"Tell me your age "<<endl;
    cin>>age;
    //cin>>age;
    //if((age<18)&&(age>0)) {
    //    cout<<"you cannot come to my party"<<endl;
    //}
    //else if (age==18){
    //   cout<<"You are a kid and you will get kicked";
    //}
    //else if (age<=1){
    //    cout<<"you are not yet born";
    //}
    //else{
    //    cout<<"you can come to party"<<endl;
    //}
    
    //*********************Switch  case statement*****
    switch (age) {
        case 18:
        /*code*/
            cout<<"you are 18"<<endl;
            break;
        case 22:
        /*code*/
            cout<<"you are 22"<<endl;
            break;
        case 2:
        /*code*/
            cout<<"you are 18"<<endl;
            break;
        default:
            cout<<"No special statement";
            break;
    }
    cout<<"done with coding";
    return 0;  
}