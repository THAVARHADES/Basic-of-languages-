import java.util.*;
 class Method{
    int add(int x,int y){
        return x+y;
    }
    float add(float x,float y){
        return x+y;
    }
    double add(double x,double y){
        return x+y;
    }
    double add(int x,float y,double z){
        return x+y+z;
    }
    float add(int x,int y,float z){
        return x+y+z;
    }
    float add(float x,float y,int z){
        return x+y+z;
    }
    double add(double x,double y,int z){
        return x+y+z;
    }
    double add(float x,float y,double z){
        return x+y+z;
    }
    double add(double x,double y,float z){
        return x+y+z;
    }
    double add(double x,float y,int z){
        return x+y+z;
    }
    double add(float x,double y,int z){
        return x+y+z;
    }
}
class Day4Class3{
    public static void main(String []args){
        float r2;
        double r3;
        int r1;
        int a=10,b=20,c=30,d=40;
        float e=3.1f,f=3.2f,g=3.3f;
        double h=2.22,i=3.33,j=4.44;
        Method m=new Method();
        r1=m.add(a,b);
        r3=m.add(h,e,a);
        r2=m.add(e,f,a);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}