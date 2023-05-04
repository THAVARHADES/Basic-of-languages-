#include<iostream>
using namespace std;
struct Array{
    int A[10];
    int size;
    int length;
};
void Display(struct Array arr)
{
    int i;
    cout<<"Elements are ";
    for(i=0;i<arr.length;i++)
        cout<<arr.A[i]; 
}
void Append(struct Array *arr,int x)
{
    if(arr->length<arr->size)
    arr->A[arr->length++]=x;
}
void insert(struct Array *arr,int index,int x)
{
    int i;
    if(index>=0 && index<=arr->length)
    {
        for(i=arr->length;i>index;i--)
            arr->A[i]=arr->A[i-1];
        arr->A[index]=x;
        arr->length++;
    }
}
int main(){
    struct Array arr1={{2,3,4,5,6},10,15};
    Append(&arr1,10);
    insert(&arr1,0,2);
    Display(arr1);
    return 0;
}