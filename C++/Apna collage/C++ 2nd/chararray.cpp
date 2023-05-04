#include<iostream>
using namespace std;
int main(){
    /*char arr[100]="apple";
    int i=0;
    while (arr[i] != '\0');
    {
        cout<<arr[i]<<endl;
        i++;
    }*/
/*    char arr[100];
    cin>>arr;
    cout<<arr[2];
*/
    int n;
    cout<<"enter the words needed";

    cin>>n;
    char arr[n+1];
    cout<<"Enter the word";
    cin>>arr;

    bool check=1;

    for(int i=0;i<n;i++)
    {
        if(arr[i] != arr[n-1-i])
        {
            check=0;
            break;
        }
    }

    if(check==true)
        cout<<"word is a palindrome"<<endl;
    else{
        cout<<"word is not a palondrome";
    }

    return 0;
}