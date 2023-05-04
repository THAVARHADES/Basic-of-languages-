import java.util.*;
class ArrayIn{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number of Array");
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=arr.length-1;i++){
            System.out.print("Enter the value of array");
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}