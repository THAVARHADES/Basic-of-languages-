import java.util.*;
class JackedArray{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int arr[][]=new int[4][];
        arr[0]=new int[2];
        arr[1]=new int[4];
        arr[2]=new int[2];
        arr[3]=new int[4];
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                System.out.println("Enter the value of collage"+i+"Enter the student marks"+j);
                arr[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}