class Demo{
    static int i;
    static int j;
    static int k;
    int x;
    int y;
    int z;
    static{
        i=1000;
        j=2000;
        k=3000;
        x=4000;
        y=5000;
        z=6000;
    }
    {
        x=4000;
        y=5000;
        z=6000;
        i=7000;
        j=8000;
        k=9000;
    }
    static void display1(){
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
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
class Day3Class2{
    public static void main(String []args){
        Demo d =new Demo();
        d.display2();
        Demo.display1();
    }
}
