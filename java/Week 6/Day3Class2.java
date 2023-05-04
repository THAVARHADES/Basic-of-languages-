import java.util.*;
class Day3Class2 {
    static void minmax(int arr[]){
        int min=0;
        int max=0;
        int item;
        int j;
        for(int i=1;i<=arr.length-1;i++){
            item=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>item){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=item;
        }
        for(int i=0;i<=arr.length-2;i++){
            min=min+arr[i];
        }
        for(int i=1;i<=arr.length-1;i++){
            max=max+arr[i];
        }
        System.out.println(min+" "+max);
    }    
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the array length");
        int n=scan.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Array Element");
        for(int i=0;i<=a.length-1;i++){
            a[i]=scan.nextInt();
        }
        minmax(a);
    }    
}