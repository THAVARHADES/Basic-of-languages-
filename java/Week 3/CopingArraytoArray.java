import java.util.*;
class CopingArraytoArray{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the array length");
        int n=scan.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<=arr1.length-1;i++){
            System.out.println("Enter the values"+" ");
            arr1[i]=scan.nextInt();
        }        
        int arr2[]=new int[n];
        for(int i=0;i<=arr1.length-1;i++){
            arr1[i]=arr2[i];
        }
        System.out.print("Array Content are 1 ");
        for(int i=0;i<=arr1.length-1;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.print("Array Content are 2 ");
        for(int i=0;i<=arr1.length-1;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}