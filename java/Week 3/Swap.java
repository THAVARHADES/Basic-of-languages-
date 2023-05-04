import java.util.*;
class Swap{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Enter 2 Number for Swapping");
        a=scan.nextInt();
        b=scan.nextInt();
        System.out.print("content Writtn");
        System.out.print(a+" "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("Content after Swapping");
        System.out.println(a+" "+b);
    }
}