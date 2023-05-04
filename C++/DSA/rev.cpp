#include<iostream>
using namespace std;
struct Array
{
    int A[10];
    int size;
    int length;
};
void Reverse(struct Array *arr)
{
    int *B;
    int i,j;
    B=(int *)malloc(arr->length*sizeof(int));
    for(i=arr->length-1,j=0;i>=0;i--,j++){
        B[j]=arr->A[i];
        for(i=0;i<arr->length;i++)
        arr->A[i]=B[i]; 
    }
}
void swap(int *x,int *y){
    int temp;
    temp=*x;
    *x=*y;
    *y=temp;
}
void Display(struct Array arr)
{
    printf("\nElements are\n");
    for(int i=0;i<arr.length;i++)
    printf("%d ",arr.A[i]);
}
void Reverse2(struct Array *arr){
    int i,j;
    for(i=0,j=arr->length-1;i<j;i++,j--)
    {
        swap(&arr->A[i],&arr->A[j]); 
    } 
}
void Merge(struct Array *arr1,struct Array *arr2)
{
    int i,j,k;
    struct Array *arr3=(struct Array *)malloc(sizeof(struct Array));
    while(i<arr1->length && j<arr2->length)
    {
        if(arr1->A[i]<arr2->A[j])
            arr3->A[k++]=arr1->A[j++];
        else
            arr3->A[k++]=arr2->A[j++];
    }
}
int main(){
    struct Array arr1={{2,34,24,36,23},10,5};
    struct Array arr2={{3,4,7,18,20},10,5};
    struct Array *arr3; 
    return 0;    
}    