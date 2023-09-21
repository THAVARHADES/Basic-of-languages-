import java.util.*;
class CircularQueue{
    private int cq[];
    private int size;
    private int r=-1;
    private int f=0;
    private int count=0;
    private Scanner scan=new Scanner(System.in);
    public CircularQueue(int n){
        cq=new int[n];
        size=cq.length;
    }
    public void insert(){
        if(count==size){
            System.out.println("Insertion Not Possible");
        }
        else
        {
            int elem;
            System.out.println("Enter the Element to be inserted");
            elem=scan.nextInt();
            r=(r+1)%size;
            cq[r]=elem;
            count++;
        }
    }
    public void delete(){
        if(count==0){
            System.out.println("Deletion Not Possible");
        }
        else{
            System.out.println("Deleted Element is"+" "+cq[f]);
            f=(f+1)%size;
            --count;
        }
    }
    public void display(){
        int f1=f;
        if(count==0){
            System.out.println("Display Not Possible");
        }
        else
        {
            for(int i=1;i<=count;i++)
            {
                System.out.print(cq[f1]+" ");
                f1=(f1+1)%size;
            }
        System.out.println();
        }
    }
}
class Day4Class1{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Queue");
        int n=scan.nextInt();
        CircularQueue circularqueue=new CircularQueue(n);
        while(true){
            System.out.println("    ");
            System.out.println("Press 1 for Insertion");
            System.out.println("Press 2 for Deletion");
            System.out.println("Press 3 for Display");
            System.out.println("Press Any number to exit");
            System.out.println("Enter you choice");
            int choice=scan.nextInt();
            switch(choice){
                case 1 : circularqueue.insert();
                    break;
                case 2 :circularqueue.delete();
                    break;
                case 3 :circularqueue.display();
                    break;
                default : System.exit(0);
            }
        }
    }
}