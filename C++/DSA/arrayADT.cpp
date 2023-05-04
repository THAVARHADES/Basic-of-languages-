#include<iostream>
using namespace std;
int n;
struct Array{
    int *A;
    int size;
    int lenght;
};
void Display(struct Array arr){
    int i;
    cout<<"Elements are";
    for(i=0;i<n;i++){
        cin>>arr.A[i];
        arr.lenght=n;
    }
}
int main(){
    struct Array arr;
    int n,i;
    cout<<"enter the size";
    cin>>arr.size;
    arr.A=(int *)malloc(arr.size*sizeof(int));
    arr.lenght=0;
    cout<<"Enter number of number";
    cin>>n;
    cout<<"Enter all elements";
    for(i=0;i<n;i++){
        cin>>arr.A[i];
    }
    arr.lenght=n;
    Display(arr);
    return 0;
}