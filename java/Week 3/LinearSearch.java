import java.util.*;
class LinearSearch{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=arr.length-1;i++){
            System.out.println("Enter the value of Array");
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter the number to search");
        int key=scan.nextInt();
        for(int i=0;i<=arr.length-1;i++){
            if(key==arr[i]){
                System.out.println("Key found in the Array"+" "+i);
                System.exit(0);
            }
        }
        System.out.println("Key not found");
    }
}