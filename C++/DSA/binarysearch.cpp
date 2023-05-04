#include<iostream>
using namespace std;
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
int binarysearch(struct Array arr,int key)
{
    int l,m,h;
    l=0;
    h=arr.lenght-1
    while(l<=h)
    {
        mid=(l+h)/2;
        if(Key==arr.A[mid])
            return mid;
        else if(key<arr.A[mid])
            h=mid-1;
        else
            l=mid+1;
    }
    return -1;
}
int main(){
    struct Array arr={{2,3,4,5,6},10,12};
    cout<<binarysearch(a,5);
    Display(arr;)    
        cout<<"Enter number of number";
    cin>>n;
    cout<<"Enter all elements";
    for(i=0;i<n;i++){
        cin>>arr.A[i];
    }
    arr.lenght=n;
    return 0;
}