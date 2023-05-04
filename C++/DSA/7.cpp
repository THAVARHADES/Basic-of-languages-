#include<iostream>
using namespace std;
class rectangle
{
    private:
    int lenght;
    int breath;
    public:
    rectangle(){lenght=breath=1;}
    rectangle(int l,int b);
    int area();
    //int perimeter();
    int getlenght(){return lenght;}
    void setlenght(int l){lenght=l;}    
};
rectangle::rectangle(int l,int b)
{
    lenght=l;
    breath=b;
}
int rectangle::area()
{
    return lenght*breath;
}
/*int rectangle::perimeter()
{
    return 2*(lenght+breath);
}*/
int main(){
    rectangle r(10,9);
    cout<<r.area();
    //cout<<r.perimeter;
    r.setlenght(20);
    cout<<r.getlenght();
    return 0;
}