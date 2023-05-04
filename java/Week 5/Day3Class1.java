class Demo{
    static int i;
    static int j;
    static int k;
    static{
        i=100;
        j=200;
        k=300;
    }
    static void display1(){
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
    int x;
    int y;
    int z;
    {
        x=400;
        y=500;
        z=600;
        i=700;
        j=800;
        k=900;
    }
    void display2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
class Day3Class1{
    public static void main(String []args){
        Demo.display1();
        Demo d=new Demo();
        d.display2();
    }
}