import java.util.*;
class Company3{
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        int arr[][]=new int[4][3];
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                System.out.println("Enter the Company"+i+"And Employee Salary"+j);
                arr[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                System.out.println("Company"+i);
                System.out.println(arr[i][j]+"   ");
            }
        }
        
    }
}
