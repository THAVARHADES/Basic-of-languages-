import java.util.*;
class Day3Class4{
    static int divisbleSumPair(int n,int arr[],int k){
        int count=0;
        for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if((arr[i]+arr[j])%k==0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String []args){
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("Enter Interger to Divide");
        int k=scan.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array Element");
        for(int i=0;i<=a.length-1;i++){
            a[i]=scan.nextInt();
        }
        System.out.println(divisbleSumPair(n,a,k));
    }
}
