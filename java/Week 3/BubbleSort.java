import java.util.*;
class BubbleSort{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in); 
        System.out.println("Enter the length of array");
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=arr.length-1;i++){
            System.out.println("Enter Array Content");
            arr[i]=scan.nextInt();
        }
        System.out.println("Array Before Sorting");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<=n-2;i++){
            for(int j=0;j<=n-2-i;j++){ 
                if(arr[j]>arr[j+1]){
                    int help=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=help;
                }   
            }   
        }
        System.out.println("Array After Sorting");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}