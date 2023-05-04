import java.util.*;
class BusinessMan{
    private int p;
    private float r;
    private int t;
    private float si;
    public void takeInput(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Principle");
        p=scan.nextInt();
        System.out.println("Enter TIme");
        t=scan.nextInt();
        r=2;
    }
    void findSI(){
        si=(p*r*t)/100;
    }
    void display(){
        System.out.println("S.I is"+"  "+"    "+si);
    }
}
class Day4Class1{
    public static void main(String []args){
        BusinessMan BM1=new BusinessMan();
        BusinessMan BM2=new BusinessMan();
        BusinessMan BM3=new BusinessMan();
        BM1.takeInput();
        BM2.takeInput();
        BM3.takeInput();
        BM1.findSI();
        BM2.findSI();
        BM3.findSI();
        BM1.display();
        BM2.display();
        BM3.display();
    }
}