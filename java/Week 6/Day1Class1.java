import java.util.*;
/*class Factorial{
    static public int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
class Day1Class1{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number to find the factorial");
        int n=scan.nextInt();
        int factorial=Factorial.fact(n);
        System.out.println("Factorail of two number"+factorial);
    }
}*/
class GCD{
    static public int gcd(int m,int n){
        if(n==0){
            return m;
        }
        else{
            return gcd(n,m%n);
        }
    }
}
class Day1Class1{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of m");
        int m=scan.nextInt();
        System.out.println("Enter the value of n");
        int n=scan.nextInt();
        int Gcd=GCD.gcd(m,n);
        System.out.println("The GCD of 2 number is"+Gcd);
    }
}