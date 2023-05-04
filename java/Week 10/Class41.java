class Demo1{
    int a;
    int b;
    public Demo1(){
        a=10;
        b=20;
    }
    public Demo1(int a,int b){
        this.a=a;
        this.b=b;
    }
}
class Demo2 extends Demo1{
    int c;
    int d;
    public Demo2(){
        c=100;
        d=200;
    }
    public Demo2(int c,int d){
        this.c=c;
        this.d=d;
    }
}
class Class41{
    public static void main(String []args){
        Demo2 d1=new Demo2(10,20);
        System.out.println(d1.a);
        System.out.println(d1.b);
        System.out.println(d1.c);
        System.out.println(d1.d);
    }
}