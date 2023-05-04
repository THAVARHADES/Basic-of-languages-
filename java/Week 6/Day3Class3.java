import java.util.*;
class Day3Class3 {
    static int diagonalDifference(int arr[][]){
        int leftsum=0;
        int rightsum=0;
        int n=arr.length;
        for(int i=0;i<=arr.length-1;i++){
            leftsum=leftsum+arr[i][i];
            rightsum=rightsum+arr[i-1-n][i-1-n];
        }
        return (Math.abs(leftsum-rightsum));
    }   
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter n");
        int n=scan.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter array contents");
        for(int i=0;i<=a.length-1;i++){
            for(int j=0;j<=a[i].length-1;j++){
                a[i][j]=scan.nextInt();
            }
        }
        System.out.println(diagonalDifference(a));
    }
}
