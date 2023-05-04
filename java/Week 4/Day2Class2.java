import java.util.*;
class Calculator{
    int a=10;
    int b=20;
    void add(){
        int x=30;
        int y=40;
        int z=a+b+x+y;
        System.out.print(z);
    }
}
class Day2Class2{
    public static void main(String []args){
        Calculator calci=new Calculator();
        calci.add();
    }
}