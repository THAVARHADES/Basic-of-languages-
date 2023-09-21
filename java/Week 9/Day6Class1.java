import java.util.*;
class DoublyLinkedList{
    class Node{
        Node prelink;
        int data;
        Node nextlink;
    }
    private Node first;
    private Scanner scan=new Scanner(System.in);
    public void insertfront(){
        System.out.println("Enter the Element");
        int elem=scan.nextInt();
        Node newnode=new Node();
        newnode.data=elem;
        newnode.prelink=null;
        newnode.nextlink=null;
        if(first==null){
            first=newnode;
        }
        else{
            newnode.nextlink=first;
            first.prelink=newnode;
            first=newnode;
        }
    }
    public void insertrear(){
        Node temp;
        System.out.println("Enter an Element");
        int elem=scan.nextInt();
        Node newnode=new Node();
        newnode.data=elem;
        newnode.prelink=null;
        newnode.nextlink=null;
        if(first==null){
            first=newnode;
        }
        else{
            temp=first;
            while(temp.nextlink!=null){
                temp=temp.nextlink;
                temp.nextlink=newnode;
                newnode.prelink=temp;
            }
        }
    }
    public void deletefront(){
        if(first==null){
            System.out.println("deletion not possible");
        }
        else if(first.nextlink==null){
            System.out.println("Element dleted is"+first.data);
            first=null;
        }
        else{
            first=first.nextlink;
            first.prelink=null;
        }
    }
    public void deleterear(){
        if(first==null){
            System.out.println("deletion not possible");
        }
        else if(first.nextlink==null){
            System.out.println("Element dleted is"+first.data);
            first=null;
        }
        else{
            Node temp;
            temp=first;
            while(temp.nextlink.nextlink==null){
                temp=temp.nextlink;
            }
            System.out.println("element deleted is"+temp.nextlink.data);
            temp.nextlink=null;
        }
    }
    public void displayforward(){
        if(first==null){
            System.out.println("display not possible");
        }
        else if(first.nextlink==null){
            System.out.println(first.data);
        }
        else{
            Node temp;
            temp=first;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.nextlink;
            }
            System.out.println();
        }
    }
    public void displayback(){
        if(first==null){
            System.out.println("display not possible");
        }
        else if(first.nextlink==null){
            System.out.println(first.data);
        }
        else{
            Node temp;
            temp=first;
            while(temp.nextlink!=null){
                temp=temp.nextlink;
            }
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.prelink;
            }
        }
        System.out.println();
    }
}
class Day6Class1{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        DoublyLinkedList dll=new DoublyLinkedList();
        while(true){
            System.out.println("press 1 for Insertionrear");
            System.out.println("press 2 for deleterear");
            System.out.println("press 3 for Insertionfront");
            System.out.println("press 4 for deletefront");
            System.out.println("press 5 for DisplayForward");
            System.out.println("press 6 for Displybackward");
            System.out.println("Any number to stop the loop");
            System.out.println("Enter your choice");
            int choice=scan.nextInt();
            switch(choice){
                case 1: dll.insertrear();
                    break;
                case 2: dll.deleterear();;
                    break;
                case 3: dll.insertfront();;
                    break;
                case 4: dll.deletefront();;
                    break;
                case 5: dll.displayforward();;
                    break;
                case 6: dll.displayback();;
                    break;
                default :System.exit(0);
            }
        } 
    }
}