 //HEADER FILES IN CPP
// TWO TYPE OF HEADER FILE ARE THEIR 1.SYSTEM 2.USER DEFINED
 #include<iostream>
 using namespace std;
  int main(){
     int a=5;
     int b=6;    
     cout<<"OPERTOR IN CPP";
     //ARITHEMATIC OPERATOR
     cout<<"THE VALUE OF a+b"<<a+b<<endl;
     cout<<"THE VALUE OF a-b"<<a-b<<endl;
     cout<<"THE VALUE OF a*b"<<a*b<<endl;
     cout<<"THE VALUE OF a/b"<<a/b<<endl;
     cout<<"THE VALUE OF a%b"<<a%b<<endl;
     cout<<"THE VALUE OF a++"<<a++<<endl;
     cout<<"THE VALUE OF a--"<<a--<<endl;
     cout<<"THE VALUE OF ++a"<<++a<<endl;
      cout<<"THE VALUE OF --a"<<--a<<endl;

    //COMPARISION OPERATOR 
     cout<<"THE FOLLOWING ARE THE TYPE OF OPERATOR IN C++<<endl";
     cout<<"THE VAUE of a==b is "<<(a==b)<<endl;
     cout<<"THE VAUE of a!=b is "<<(a!=b)<<endl;
     cout<<"THE VAUE of a>=b is "<<(a>=b)<<endl;
     cout<<"THE VAUE of a<=b is "<<(a<=b)<<endl;
     cout<<"THE VAUE of a>b is "<<(a>b)<<endl;
     cout<<"THE VAUE of a<b is "<<(a<b)<<endl;
    //LOGICAL OPERATOR 
    cout<<"FOLLOWING ARE THE LOGICAL OPERATORIN C++"<<endl;
    cout<<"THE VALUE OF THIS LOGICAL AND OPERATOR ((a==b) && (a<b))is:"<< ((a==b) && (a<b))<<endl;
    cout<<"THE VALUE OF THIS LOGICAL AND OPERATOR ((a==b) || (a<b))is:"<< ((a==b) || (a<b))<<endl;
    cout<<"THE VALUE OF THIS LOGICAL AND OPERATOR !(a==b) is:"<<!(a==b)<<endl;
     return 0;
 }