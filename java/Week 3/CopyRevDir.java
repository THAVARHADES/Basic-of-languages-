import java.util.*;
class CopyRevDir{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=scan.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<=arr1.length-1;i++){
            System.out.println("Enter the values"+" ");
            arr1[i]=scan.nextInt();
        }        
        int arr2[]=new int[arr1.length];
        int j=arr2.length-1;
        for(int i=0;i<=arr1.length-1;i++){
            arr2[j]=arr1[i];
            j--;
        }
        System.out.print("Array Content are 1 ");
        for(int i=0;i<=arr1.length-1;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println(" ");
        System.out.print("Array Content are 2 ");
        for(int i=0;i<=arr2.length-1;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}