import java.util.*;
class Demo1 extends Thread{
    public void run(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Banking activity Started");
        System.out.println("ENter account number");
        int accno=scan.nextInt();
        System.out.println("Enter password");
        int pwd=scan.nextInt();
        System.out.println("Banking activity ended"); 
    }
}
class Demo2 extends Thread{
    public void run(){
        try{
            System.out.print("Printing activity STarted");
            for(int i=1;i<=5;i++){
                System.out.println("Kodnest");
                Thread.sleep(5000);
            }
            System.out.println("Printing activity ended");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class Demo3 extends Thread{
    public  void run(){
        try{
            System.out.println("Multiplication activity started");
            int a=123;
            int b=456;
            Thread.sleep(5000);
            int c=a*b;
            System.out.println(c);
            System.out.println("Multiplicaton activity ended");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class Class65{
    public static void main(String []args){
        Demo1 d1=new Demo1();
        Demo2 d2=new Demo2();
        Demo3 d3=new Demo3();
        d1.start();
        d2.start();
        d3.start();
    }
}
