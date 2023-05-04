class Demo1{
    public void div(){
        int a=10;
        int b=0;
        int c=a/b;
        System.out.println(c);
    }
}
class Demo2{
    public void alpha(){
        Demo1 d1=new Demo1();
        d1.div();
    }
}
class Demo3{
    public void beta(){
        Demo2 d2=new Demo2();
        d2.alpha();
    }
}
class DemoApp{
    public static void main(String []args){
        try{
            Demo3 d3=new Demo3();
            d3.beta();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}