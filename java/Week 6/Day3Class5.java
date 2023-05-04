import java.util.*;
class Day3Class5 {
    static void BonoApptit(int bill[],int k,int bcharged){
        int sum=0;
        for(int i=0;i<=bill.length-1;i++){
            if(i!=k){
                sum=sum+bill[i];
            }
        }
        int acharged=sum/2;
        if(bcharged==acharged){
            System.out.println("BonoApptit");
        }
        else{
            System.out.println("Prabhakaran should pay Akash Rs :"+(bcharged-acharged));
        }
    }
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of items");
        int n=scan.nextInt();
        System.out.println("Enter item index that akash will not use");
        int k=scan.nextInt();
        int a[]=new int[n];
        System.out.println("Eneter bill amount at each items");
        for(int i=0;i<=n-1;i++){
            a[i]=scan.nextInt();
        }
        System.out.println("Enter bill charged by prabhakaran and akash");
        int bcharged=scan.nextInt();
        BonoApptit(a,k,bcharged);
    }
}
