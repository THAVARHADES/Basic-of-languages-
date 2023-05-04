import java.util.*;
class Sorting{
    void SelectingSort(int arr[]){
        int min;
        int pos;
        int help;
        for(int i=0;i<=arr.length-1;i++){
            min=arr[i];
            pos=i;
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[j]<min){
                    min=arr[j];
                    pos=j;
                }
            }
            help=arr[i];
            arr[i]=arr[pos];
            arr[pos]=help;
        }
    }
}
class Day3Class3{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array Element");
        for(int i=0;i<=arr.length-1;i++){
            System.out.println("Enter the Element");
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Sorting s=new Sorting();
        s.SelectingSort(arr);
        System.out.print("Array after sorting are");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}