import java.util.*;
class BinarySearch{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Array Length");
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=arr.length-1;i++){
            System.out.println("Enter the Array Contents"+i);
            arr[i]=scan.nextInt();
        }
        
        System.out.println("Enter the key");
        int key=scan.nextInt();
        int low=0;
        int high=arr.length-1;
        System.out.print("Enter the Array Contents");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(+arr[i]+" ");
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(key==mid){
                System.out.println("Key found"+mid);
                System.exit(0);
            }
            else if(key>arr[mid]){
                low=mid+1;
                high=high;
            }
            else{
                high=mid-1;
                low=low;
            }
        }
        System.out.println("Key not Found");
    }
}