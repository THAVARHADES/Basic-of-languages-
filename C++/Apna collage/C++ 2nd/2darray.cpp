#include<iostream>
using namespace std;
int main(){
    int n,m;
    cout<<"Enter the Row";
    cin>>n;
    cout<<"Enter the Column";
    cin>>m;
    int arr[n][m];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            cout<<"Enter Values of Array\t"<<i<<" \t"<<j<<"  \t";       
            cin>>arr[i][j];
        }
    }
    cout<<"Matrix is :\n";
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            cout<<arr[i][j]<<" ";
        }
        cout<<"\n";
    }
    int x;
    cout<<"Enter Number to find";
    cin>>x;
    bool flag;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(arr[i][j]==x){
                cout<<"Element found";
                flag=true;
            }
        }
    }
    if (flag)
    {
        cout<<"Element is found";
    }
    else{
        cout<<"element is not found";
    }
    return 0;
}