#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter the no. of array";
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cout<<"Enter the valur of Array"<<i+1<<"\t";
        cin>>arr[n];
    }
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[i]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
    }
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    return 0;
}