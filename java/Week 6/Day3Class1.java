import java.util.*;
class Day3Class1{
    static int birthdayCakeCandle(int arr[]){
        int max=0;
        int count=0;
        max=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==max){
                count++;
            }
        }
        return count;
    }
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int a[]=new int[m];
        for(int i=0;i<=a.length-1;i++){
            a[i]=scan.nextInt();
        }
        System.out.println(birthdayCakeCandle(a));
    }
}