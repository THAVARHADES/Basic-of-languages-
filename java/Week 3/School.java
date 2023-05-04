import java.util.*;
class School{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int arr[][]=new int[3][4];
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr.length-1;j++){
                System.out.println("Enter the School Number"+i+"Enter the student"+j);
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.print("Array Content are");
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr.length-1;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
