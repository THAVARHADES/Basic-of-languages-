import java.util.*;
/*class Math{
    void add(){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.print(c);
    }
}
class DayTClassO{
    public static void main(String []args){
        Math m=new Math();
        m.add();
    }
}*/
/*class Math{
    void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
}
class DayTClassO{
    public static void main(String []args){
        Math m=new Math();
        int x=10;
        int y=20;
        m.add(x,y);
    }
}*/
/*class Math{
    int add(){
        int a=10;
        int b=20;
        int c=a+b;
        return c;
    }
}
class DayTClassO{
    public static void main(String []args){
        Math m=new Math();
        int ads=m.add();
        System.out.println(ads);
    }
}*/
class Math{
    int add(int x,int y){
        int c=x+y;
        return c;
    }

    public static int abs(int i) {
        return 0;
    }
}
class Day2Class1{
    public static void main(String []args){
        Math m=new Math();
        int psd=m.add(10,20);
        System.out.println(psd);
    }
}