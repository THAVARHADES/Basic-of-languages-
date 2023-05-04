#include<iostream>
using namespace std;
/*inline int product(int a, int b){
    return a*b;
}
int main(){
    int a,b;
    cout<<"Enter the value of a and b"<<endl;
    cin>>a>>b;
    cout<<"The product of a and b is "<<product(a,b)<<endl;
    cout<<"The product of a and b is "<<product(a,b)<<endl;
    cout<<"The product of a and b is "<<product(a,b)<<endl;
    cout<<"The product of a and b is "<<product(a,b)<<endl;
    cout<<"The product of a and b is "<<product(a,b)<<endl;
    cout<<"The product of a and b is "<<product(a,b)<<endl;
    cout<<"The product of a and b is "<<product(a,b)<<endl;
    cout<<"The product of a and b is "<<product(a,b)<<endl;
    cout<<"The product of a and b is "<<product(a,b)<<endl;
    cout<<"The product of a and b is "<<product(a,b)<<endl;*/
    inline int product(int a,int b){
        //Do not recoomed to use below line in inline function
        /*static int c=0;//This executes onlyone
        c=c+1;//Next timme this funcation is run,the  value of c will be retained*/
        return a*b;
    }
    float moneyReceived(float currentMoney,float factor=1.04){
            return currentMoney*factor;    
    }
    int main(){
        int a,b;
        /*cout<<"Enter the value of a and b"<<endl;
        cin>>a>>b;*/
        int money=10000;
        cout<<"If you have"<<money<<"Rs in your bank account,you will recieve"<<moneyReceived(money)<<endl<<"Rs after 1 year"<<endl;
        cout<<" For VIP: If you have"<<money<<"Rs in your bank account,you will recieve"<<moneyReceived(money,1.10)<<endl<<"Rs after 1 year"<<endl;   
        /*cout<<"The product of a and b is "<<product(a,b)<<endl;
        cout<<"The product of a and b is "<<product(a,b)<<endl;
        cout<<"The product of a and b is "<<product(a,b)<<endl;
        cout<<"The product of a and b is "<<product(a,b)<<endl;
        cout<<"The product of a and b is "<<product(a,b)<<endl;
        cout<<"The product of a and b is "<<product(a,b)<<endl;
        cout<<"The product of a and b is "<<product(a,b)<<endl;*/
    return 0;
}