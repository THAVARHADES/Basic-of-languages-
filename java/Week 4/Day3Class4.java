import java.util.*;
class Sorting{
    void InsertionSort(int a[]){
        int item;
        int j;
        for(int i=0;i<=a.length-1;i++){
            item=a[i];
            j=i-1;
            while(j>=0 && a[j]>item){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=item;
        }
    }
}
class Day3Class4{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter array length");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array Conent");
        for(int i=0;i<=arr.length-1;i++){
            System.out.println("Enter a Number"+" "+i);
            arr[i]=scan.nextInt();
        }
        System.out.print("Array content before Sorting");
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        Sorting s=new Sorting();
        s.InsertionSort(arr);
        System.out.println("Array Content after Sorting");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}