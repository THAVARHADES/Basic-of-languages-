import java.util.*;
class Array{
    private int arr[];
    private Scanner scan=new Scanner(System.in);
    public Array(int n){
        arr=new int[n];
    }
    public void insert(){
        System.out.print("Enter the position 0 to"+(arr.length-1));
        int pos=scan.nextInt();
        System.out.print("Enter the Element value");
        int elem=scan.nextInt();
        arr[pos]=elem;
    }
    public void delete(){
        System.out.print("Enter the position to delete the element");
        int pos=scan.nextInt();
        System.out.print("Element delete is"+arr[pos]);
        arr[pos]=0;
    }
    public void display(){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
class Day1Class1{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Array Length");
        int n=scan.nextInt();
        Array a=new Array(n);
        while(true){
            System.out.println("Press 1  for Insertion");
            System.out.println("Press 2  for Deleting");
            System.out.println("Press 3  for Display");
            System.out.println("Any other Number for existing");
            System.out.println("Enter your choice");
            int choice=scan.nextInt();
            switch(choice){
                case 1:a.insert();
                    break;
                case 2:a.delete();
                    break;
                case 3:a.display();
                    break;
                default:System.exit(0);
                    break;
            }
        }
    }
}