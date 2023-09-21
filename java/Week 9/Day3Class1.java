import java.util.*;
class Queue
{
    private int q[];
    private int size;
    private int r=-1;
    private int f=0;
    private Scanner scan=new Scanner(System.in);
    public Queue(int n)
    {
        q=new int[n];
        size=q.length;
    }
    public void insert()
    {
        int elem;
        if(r==size-1)
        {
            System.out.println("Insertion Not Possible");
        }
        else
        {
            System.out.println("Enter the element to be inserted");
            elem=scan.nextInt();
            ++r;
            q[r]=elem;
        }
    }
    public void delete()
    {
        if(r==-1 || f>r)
        {
            System.out.println("Deletion not possilbe");
        }  
        else
        {
            System.out.println("Element deleted is"+" "+q[f]);
            ++f;
        }
    }
    public void display()
    {
        if(r==-1 || f>r)
        {
            System.out.println("Display not Possible");
        }
        else
        {
            for(int i=f;i<=r;i++){
                System.out.print(q[i]+" ");
            }
        }
    }
}
class Day3Class1
{
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the queue length");
        int n=scan.nextInt();
        Queue queue=new Queue(n);
        while(true)
        {
            System.out.println("Press 1 for insertion");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for display");
            System.out.println("Press any number for Stop");
            System.out.println("Enter your choice");
            int choice=scan.nextInt();
            switch(choice)
            {
                case 1: queue.insert();
                    break;
                case 2 : queue.delete();
                    break;
                case 3 : queue.display();
                    break;
                default : System.exit(0);
            }
        }
    }
}