#include<iostream>
using namespace std;
/*void func(int n)
{
    if(n>0)
    {
        cout<<n<<endl;
        func(n-1);
    }
}
int main(){
    int x=3;
    func(x);
    return 0;
}*/
void func(int n)
{
    if(n>0)
    {
        func(n-1);
        cout<<n;
    }
}
int main(){
    int x=3;
    func(x);
    return 0;
}