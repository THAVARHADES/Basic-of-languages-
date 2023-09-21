import java.util.*;
class SwapinArray{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the length of Array");
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=arr.length-1;i++){
            System.out.println("Enter the value of Array");
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter Array need to be Swapped");
        int ind1=scan.nextInt();
        int ind2=scan.nextInt();
        System.out.print("Array content before swapping");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        int help;
        help=arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=help;
        System.out.print("Array content after swapping");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}