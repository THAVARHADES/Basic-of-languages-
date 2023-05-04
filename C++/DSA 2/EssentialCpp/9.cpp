/*#include<iostream>
using namespace std;
struct Rectangle{
    int length;
    int breadth;
};
int area(struct Rectangle r1){
    return r1.length*r1.breadth;
}
int main(){
    struct Rectangle r={10,4};
    cout<<area(r);
    return 0;
}*/
#include<iostream>
using namespace std;
struct test{
    int A[5];
    int n;
};
void func(struct test t1){
    t1.A[0]=10;
    t1.A[1]=15;
}
int main(){
    struct test t={{2,3,4,5,6},5};
    func(t);
    for(int i=0;i<n;i++){
        cout<<A[i];
    }
    return 0;
}