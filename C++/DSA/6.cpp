#include<iostream>
using namespace std;
class rectangle
{
    private:
        int lenght;
        int breath;
    public:
    void initalize(int l,int b)
    {
        lenght=l;
        breath=b;   
    }
    int area()
    {
        return lenght*breath;
    }
    void changelenght(int l)
    {
        lenght=l;
    }
};
int main(){
    rectangle r;
    r.initalize(10,5);
    r.area();
    r.changelenght(88);
    cout<<r.area;    
    return 0;
}