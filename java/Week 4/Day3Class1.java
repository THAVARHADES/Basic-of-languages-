import java.util.*;
class  EuclieanAlgorithum{
    int findGCD(int x,int y){
        while(y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        int g=x;
        return g;
    }
}
class Day3Class1{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=scan.nextInt();
        int b=scan.nextInt();
        EuclieanAlgorithum e=new EuclieanAlgorithum();
        int d=e.findGCD(a,b);
        System.out.print("GCD of"+a+"And"+b+"is"+d);
    }
}