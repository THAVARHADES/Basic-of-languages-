#include<iostream>
using namespace std;
class Array
{
    private:
        int *A;
        int size;
        int length;
        void Swap(int *x,int *y);
    public:
        Array(){
            size=10;
            length=0;
            A=new int[size];
        }
        Array(int sz){
            size=sz;
            length=0;
            A=new int [size];
        }
        ~Array(){
            delete []A;
        }
        void Display();
        void Append(int x);
        void Insert(int index,int x);
        int LinearSearch(int key);
        int BinarySearch(int key);
        int RBinSearch(int a[],int l,int h,int key);
        int Get(int index);
        void Set(int index,int x);
        int Max();
        int Min();
        int Sum();
        float Avg();
        void Reverse();
        void Reverse2();
        void Insertsort(int x);
        int IsSort(int x);
        void Rearrange();
        Array* Merge(Array *arr2);  
        Array* Union(Array *arr2);  
        Array* Intersection(Array *arr2);  
        Array* Difference(Array *arr2);  
};
void Array::Display(){
    int i;
    cout<<"Elements are\n";
    for(i=0;i<length;i++)
        cout<<A[i]<<endl;
}
void Array::Append(int x){
    if(length<size)
        A[length++]=x;
}
void Array::Insert(int index,int x){
    int i;
    if(index>=0 && index<=length){
        for(i=length;i>index;i--)
            A[i]=A[i-1];
        A[index]=x;
        length;
    }
}
int Array::Insert