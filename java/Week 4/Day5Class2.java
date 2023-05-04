class Calculate{
    void add(int x,int y){
        int z;
        z=x+y;
        System.out.println(z);
    }
}
class Day5Class2{
    public static void main(String []args){
        Calculate Cal=new Calculate();
        Cal.add(10,20);
        int a=20;
        int b=30;
        Cal.add(a,b);
    }
}