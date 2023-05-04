import java.util.*;
class Employee{
    public static void main (String []args){
        Scanner scan =new Scanner(System.in);
        int arr[]=new int[7];
        for (int i=0;i<=arr.length-1;i++){
            System.out.println("Enter the Employee salary"+i);
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
}