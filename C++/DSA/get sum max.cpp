#include<stdio.h>
#include<iostream>
using namespace std;
struct Array
{
    int A[10];
    int size;
    int length;
};
void Display(struct Array arr)
{
    int i;
    printf("\nElements are\n");
    for(i=0;i<arr.length;i++)
    printf("%d ",arr.A[i]);
}
int get(struct Array arr,int index)
{
        if(index>=0 && index<arr.length)
            return arr.A[index];
    return -1;
}
void set(struct Array *arr,int index,int x)
{
    if(index>=0 && index<arr->length)
      arr->A[index];
}
int Max(struct Array arr)
{
    int max=arr.A[0];
    int i;
    for(i=1;i<arr.length;i++)
    {
        if(arr.A[i]>max)
            max=arr.A[i];
    }
}
int Min(struct Array arr)
{
    int min=arr.A[0];
    int i;
    for(i=1;i<arr.length;i++)
    {
        if(arr.A[i]>min)
            min=arr.A[i];
    }
    return min;
}
int sum(struct Array arr)
{
    int s=0;
    int i;
    for(i=0;i<arr.length;i++)
        s+=arr.A[i];
    return s;
}
float avg(struct Array arr)
{
    return (float)sum (arr)/arr.length;
}
int main(){
    struct Array arr1={{2,3,4,56,6},10,15};
    printf("%d",get(arr1,3));
    Display(arr1);
    return 0;
}